package com.example.vhr.service.impl;

import com.example.vhr.entity.Hr;
import com.example.vhr.entity.Menu;
import com.example.vhr.mapper.MenuMapper;
import com.example.vhr.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByHrId() {
        Integer hrId = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return menuMapper.listMenusByHrId(hrId);
    }

    @Override
    public List<Menu> getAllMenusWithRule() {
        return menuMapper.getAllMenusWithRule();
    }
}
