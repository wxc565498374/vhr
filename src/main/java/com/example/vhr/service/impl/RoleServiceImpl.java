package com.example.vhr.service.impl;

import com.example.vhr.entity.Role;
import com.example.vhr.mapper.RoleMapper;
import com.example.vhr.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleByHrId(Integer hrId) {
        return roleMapper.getRoleByHrId(hrId);
    }
}
