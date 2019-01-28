package com.springcloud.dream.mall.controller;

import com.springcloud.dream.mall.entity.User;
import com.springcloud.dream.mall.service.UserService;
import com.springcloud.dream.mall.util.FormatTimeZoneDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") int id) {
        User user = userService.queryById(id);

        if (null==user){
            user=new User();
            user.setId(0);
            user.setUserName("Lucas");
            user.setPassword("123");
            user.setName("songZhen");
            user.setAge(25);
            user.setSex(1);
            user.setBirthday(FormatTimeZoneDate.formatTime(new Date()));
            user.setCreatTime(FormatTimeZoneDate.formatTime(new Date()));
            user.setUpdateTime(FormatTimeZoneDate.formatTime(new Date()));
            user.setNote("");
            return user;
        }
        return user;
    }


}
