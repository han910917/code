package com.javaSharding.code.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/31 13:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeiXinIdDTO {

    private String session_key;

    private String openid;
}
