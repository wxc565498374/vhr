package com.example.vhr.service;

import com.example.vhr.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface MenuService extends IService<Menu> {

    List<Menu> getMenusByHrId();
}
