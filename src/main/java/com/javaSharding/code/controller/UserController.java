package com.javaSharding.code.controller;

import com.javaSharding.code.domain.dto.LoginInfoDTO;
import com.javaSharding.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:15
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
    * @description: 保存用户登录信息
    * @author: hgm
    * @date: 2020/12/30 12:56
    * @param loginInfoDTO: 
    * @return: void
    */
    @PostMapping("/saveUserLoginInfo")
    public void saveUserLoginInfo(@RequestBody LoginInfoDTO loginInfoDTO){
        userService.saveUserLoginInfo(loginInfoDTO);
    }
}
