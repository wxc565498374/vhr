package com.example.vhr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.vhr.entity.Hr;
import com.example.vhr.mapper.HrMapper;
import com.example.vhr.service.HrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
@Service
public class HrServiceImpl extends ServiceImpl<HrMapper, Hr> implements HrService {
    @Autowired
    private HrMapper hrMapper;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = getHrByUsername(s);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        hr.setRoles(roleService.getRoleByHrId(hr.getId()));
        return hr;
    }

    @Override
    public Hr getHrByUsername(String username) {
        QueryWrapper<Hr> wrapper = new QueryWrapper<>();
        wrapper.eq("username",  username);
        return getOne(wrapper);
    }
}
