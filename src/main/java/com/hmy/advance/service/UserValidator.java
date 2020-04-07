package com.hmy.advance.service;

import com.hmy.advance.pojo.User;

public interface UserValidator {

    //检测对象是否为空
    public Boolean validate(User user);
}
