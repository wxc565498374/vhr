package com.example.vhr.service;

import com.example.vhr.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface RoleService extends IService<Role> {

   List<Role> getRoleByHrId(@Param("hrId") Integer hrId);
}
