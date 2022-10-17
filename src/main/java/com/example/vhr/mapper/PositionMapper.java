package com.example.vhr.mapper;

import com.example.vhr.entity.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface PositionMapper extends BaseMapper<Position> {

    List<Position> getAllPosition();
}
