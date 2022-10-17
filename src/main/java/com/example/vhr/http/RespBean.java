package com.example.vhr.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wangxiaochao
 * @date 2022-10-03 23:03
 * @description
 */
@Getter
@Setter
@AllArgsConstructor
public class RespBean {
    private Integer status;

    private String msg;

    private Object obj;

    private RespBean(){
    }

    public static RespBean ok(String msg){
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, Object obj){
        return new RespBean(200, msg, obj);
    }

    public static RespBean error(String msg){
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object obj){
        return new RespBean(500, msg, obj);
    }
}
