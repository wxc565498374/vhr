package com.example.vhr.service;

import com.example.vhr.entity.Position;
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
public interface PositionService extends IService<Position> {

    List<Position> getAllPosition();
}
