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
public class Employeeremove implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("eid")
    private Integer eid;

    /**
     * 调动后部门
     */
    @TableField("afterDepId")
    private Integer afterDepId;

    /**
     * 调动后职位
     */
    @TableField("afterJobId")
    private Integer afterJobId;

    /**
     * 调动日期
     */
    @TableField("removeDate")
    private Date removeDate;

    /**
     * 调动原因
     */
    @TableField("reason")
    private String reason;

    @TableField("remark")
    private String remark;


}
