package com.xin.common.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: ChenXin
 * @time: 2019/11/27 3:39 下午
 */
@Data
public class User implements Serializable {
    private Long id;//主键id

    private String email;//电子邮件

    private String phone;//手机号

    private String name;//姓名

    private String passwd;//密码

    private String confirmPasswd;

    private Integer type;//普通用户1，经纪人2

    private Date createTime;//创建时间

    private Integer enable;//是否启用(0.停用,1.启用)

    private String  avatar;//头像图片

    private MultipartFile avatarFile;

    private String newPassword;

    private String key;

    private Long   agencyId;

    private String aboutme;

    private String agencyName;
}
