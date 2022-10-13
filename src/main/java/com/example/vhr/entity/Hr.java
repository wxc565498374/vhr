package com.example.vhr.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hr")
public class Hr implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    /**
     * hrID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 住宅电话
     */
    @TableField("telephone")
    private String telephone;

    /**
     * 联系地址
     */
    @TableField("address")
    private String address;

    @TableField("enabled")
    private Boolean enabled;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 用户所处的角色
     */
    @TableField(exist = false)
    private List<Role> roles;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    @TableField("userface")
    private String userface;

    @TableField("remark")
    private String remark;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
