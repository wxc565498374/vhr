package com.example.vhr.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
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
@TableName
public class Employeeec implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    @TableField("eid")
    private Integer eid;

    /**
     * 奖罚日期
     */
    @TableField("ecDate")
    private Date ecDate;

    /**
     * 奖罚原因
     */
    @TableField("ecReason")
    private String ecReason;

    /**
     * 奖罚分
     */
    @TableField("ecPoint")
    private Integer ecPoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    @TableField("ecType")
    private Integer ecType;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


}
