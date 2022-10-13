package com.example.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("url")
    private String url;

    @TableField("path")
    private String path;

    @TableField("component")
    private String component;

    @TableField("name")
    private String name;

    @TableField("iconCls")
    private String iconCls;

    private Meta meta;

    private List<Menu> children;

    private List<Role> roles;

    @TableField("parentId")
    private Integer parentId;

    @TableField("enabled")
    private Boolean enabled;


}
