package com.dooioo.vip.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户 Model
 *
 * @author Vincent
 * @version 1.0
 * @since 2016-6-1
 */
public class User implements Serializable {

    private String userId;
    private String userName;
    private Integer userAge;
    private Date userBirth;
    private String userAvatar;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}