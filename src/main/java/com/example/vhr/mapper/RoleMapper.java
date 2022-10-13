package com.example.vhr.mapper;

import com.example.vhr.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> getRoleByHrId(@Param("hrId") Integer hrId);
}
