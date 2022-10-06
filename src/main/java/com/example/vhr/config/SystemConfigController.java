package com.example.vhr.config;

import com.example.vhr.entity.Menu;
import com.example.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangxiaochao
 * @date 2022-10-04 16:23
 * @description
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/menu")
    public List<Menu> getMenusById(){
        return menuService.getMenusByHrId();
    }
}
