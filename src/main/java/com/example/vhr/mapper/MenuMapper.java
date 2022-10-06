package com.example.vhr.mapper;

import com.example.vhr.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> listMenusByHrId(@Param("hrId") Integer hrId);
}

