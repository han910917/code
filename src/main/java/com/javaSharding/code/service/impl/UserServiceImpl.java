package com.javaSharding.code.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weixin.demo.common.bean.WxMappingJackson2HttpMessageConverter;
import com.weixin.demo.domain.dto.LoginInfoDTO;
import com.weixin.demo.domain.dto.WeiXinIdDTO;
import com.weixin.demo.domain.entity.User;
import com.weixin.demo.repository.UserRepository;
import com.weixin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:17
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User selectUser(String username) {
        return userRepository.findByusername(username);
    }

    @Override
    public void saveUserLoginInfo(LoginInfoDTO loginInfoDTO) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx4815b150a3addb5b&secret=747cf81f7bc11a9a85780dd3584a9130&js_code="+ loginInfoDTO.getCode() +"&grant_type=authorization_code";

        restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
        WeiXinIdDTO obj = restTemplate.getForObject(url, WeiXinIdDTO.class);

        String openid = obj.getOpenid();

        loginInfoDTO.setOpenId(openid);

    }
}
