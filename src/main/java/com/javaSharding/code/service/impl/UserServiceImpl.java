package com.javaSharding.code.service.impl;

import com.javaSharding.code.common.bean.WxMappingJackson2HttpMessageConverter;
import com.javaSharding.code.domain.dto.LoginInfoDTO;
import com.javaSharding.code.domain.dto.WeiXinIdDTO;
import com.javaSharding.code.domain.entity.User;
import com.javaSharding.code.repository.UserRepository;
import com.javaSharding.code.service.UserService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:17
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    protected Mapper dozerMapper;

    @Override
    public void saveUserLoginInfo(LoginInfoDTO loginInfoDTO) {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx4815b150a3addb5b&secret=747cf81f7bc11a9a85780dd3584a9130&js_code="+ loginInfoDTO.getCode() +"&grant_type=authorization_code";

        restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
        WeiXinIdDTO obj = restTemplate.getForObject(url, WeiXinIdDTO.class);

        String openid = obj.getOpenid();

        User user = userRepository.findByopenid(openid);

        // 新用户进行保存
       if(null == user){
           loginInfoDTO.setOpenid(openid);

           User save = dozerMapper.map(loginInfoDTO, User.class);

           save = userRepository.save(save);
           System.out.println(save.toString());
       }
    }
}
