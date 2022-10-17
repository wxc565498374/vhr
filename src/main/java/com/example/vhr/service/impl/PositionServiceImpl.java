package com.example.vhr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.vhr.entity.Position;
import com.example.vhr.mapper.PositionMapper;
import com.example.vhr.service.PositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getAllPosition() {
        return positionMapper.getAllPosition();
    }
}
