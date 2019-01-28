package com.springcloud.dream.mall.service;

import com.springcloud.dream.mall.dao.UserMapper;
import com.springcloud.dream.mall.entity.User;
import com.springcloud.dream.mall.util.FormatTimeZoneDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user==null){
            return null;
        }
        FormatTimeZoneDate.formatTime(user.getBirthday());
        FormatTimeZoneDate.formatTime(user.getCreatTime());
        FormatTimeZoneDate.formatTime(user.getUpdateTime());
        return user;
    }
}