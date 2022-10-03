package com.example.vhr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.vhr.entity.Hr;
import com.example.vhr.mapper.HrMapper;
import com.example.vhr.service.HrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<Hr> wrapper = new QueryWrapper<>();
        wrapper.eq("username",  s);
        Hr hr = getOne(wrapper);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
