package com.example.vhr.config;

import com.example.vhr.entity.Menu;
import com.example.vhr.entity.Role;
import com.example.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @author wangxiaochao
 * @date 2022-10-08 19:50
 * @description 根据用户传的请求地址，分析用户是哪些角色
 * 1、CustomerFilterInvocationSecurityMetadataSource
 * 2、CustomerUrlDecisionManager
 */
@Component
public class CustomerFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private MenuService menuService;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        // 查询所有菜单并带出访问每个菜单需要的角色
        List<Menu> menus = menuService.getAllMenusWithRule();
        for (Menu menu : menus) {
            if (antPathMatcher.match(menu.getUrl(), requestUrl)) {
                List<Role> roles = menu.getRoles();
                String[] str = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    str[i] = roles.get(i).getName();
                }
                // 这些角色可以访问这个接口路径
                return SecurityConfig.createList(str);
            }
        }
        return SecurityConfig.createList("ROLB_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
