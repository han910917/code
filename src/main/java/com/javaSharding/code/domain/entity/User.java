package com.javaSharding.code.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

    @Column(name = "language")
    private String language;

    @Column(name = "avatarurl")
    private String avatarurl;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "openid")
    private String openid;
}
