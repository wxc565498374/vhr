package com.example.vhr.controller.sys.basic;


import com.example.vhr.entity.Position;
import com.example.vhr.http.RespBean;
import com.example.vhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/")
    public List<Position> getAllPosition(){
        return positionService.getAllPosition();
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        position.setCreateDate(new Date());
        position.setEnabled(true);
        if (positionService.saveOrUpdate(position)) {
            return RespBean.ok("添加成功！");
        }
        return RespBean.ok("添加失败！");
    }

    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updateById(position)) {
            return RespBean.ok("修改成功！");
        }
        return RespBean.ok("修改失败！");
    }

    @DeleteMapping("/{id}")
    public RespBean delPosition(@PathVariable Integer id){
        if (positionService.removeById(id)) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.ok("删除失败！");
    }

    @DeleteMapping("/delBatch/{ids}")
    public RespBean delBatch(@PathVariable String ids){
        if (positionService.removeByIds(Arrays.asList(ids.split(",")))) {
            return RespBean.ok("批量删除成功！");
        }
        return RespBean.ok("批量删除失败！");
    }
}

