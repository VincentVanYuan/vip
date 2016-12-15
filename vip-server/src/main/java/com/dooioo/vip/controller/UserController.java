package com.dooioo.vip.controller;

import com.dooioo.vip.model.User;
import com.dooioo.vip.spi.UserSpi;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Vincent on 16/12/15.
 */
@RestController
public class UserController implements UserSpi {


    @Override
    public void insertUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "userAge", required = false) Integer userAge, @RequestParam(value = "userBirth", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date userBirth, @RequestParam(value = "userAvatar", required = false) String userAvatar) {
        System.out.println("*****");
    }

    @Override
    public User getUser(@RequestParam(value = "userId") String userId) {
        System.out.println("*****");
        return null;
    }
}
