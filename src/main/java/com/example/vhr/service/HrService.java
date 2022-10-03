package com.example.vhr.service;

import com.example.vhr.entity.Hr;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxiaochao
 * @since 2022-10-03
 */
public interface HrService extends IService<Hr>,  UserDetailsService {

}
