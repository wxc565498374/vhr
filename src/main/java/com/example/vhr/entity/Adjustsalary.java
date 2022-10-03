package com.example.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
public class Adjustsalary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("eid")
    private Integer eid;

    /**
     * 调薪日期
     */
    @TableField("asDate")
    private Date asDate;

    /**
     * 调前薪资
     */
    @TableField("beforeSalary")
    private Integer beforeSalary;

    /**
     * 调后薪资
     */
    @TableField("afterSalary")
    private Integer afterSalary;

    /**
     * 调薪原因
     */
    @TableField("reason")
    private String reason;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


}
