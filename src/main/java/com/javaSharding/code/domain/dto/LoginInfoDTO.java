package com.javaSharding.code.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/30 12:37
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginInfoDTO {

    private String code;

    private String nickName;

    private String city;

    private String province;

    private String country;

    private String language;

    private String avatarUrl;

    private Integer gender;

    private String openId;
}
