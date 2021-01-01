package com.javaSharding.code.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author hgm
 * @Description TODO
 * @Date 2020/12/29 19:19
 * @Version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

    @Column(name = "language")
    private String language;

    @Column(name = "avatarUrl")
    private String avatarUrl;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "openId")
    private String openId;
}
