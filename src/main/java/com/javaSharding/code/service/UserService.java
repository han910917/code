package com.javaSharding.code.service;

import com.weixin.demo.domain.dto.LoginInfoDTO;
import com.weixin.demo.domain.entity.User;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:16
 * @Version 1.0
 */
public interface UserService {
    public User selectUser(String username);

    /**
     * @description: 保存用户登录信息
     * @author: hgm
     * @date: 2020/12/30 12:56
     * @param loginInfoDTO:
     * @return: void
     */
    void saveUserLoginInfo(LoginInfoDTO loginInfoDTO);
}
