package com.dooioo.vip.spi;

import com.dooioo.vip.model.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Created by Vincent on 16/12/15.
 */
public interface UserSpi {

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    void insertUser(@RequestParam(value = "userName") String userName,
                    @RequestParam(value = "userAge", required = false) Integer userAge,
                    @RequestParam(value = "userBirth", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date userBirth,
                    @RequestParam(value = "userAvatar", required = false) String userAvatar);

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    User getUser(@RequestParam(value = "userId") String userId);

}
