package com.hmy.advance.service.impl;

import com.hmy.advance.pojo.User;
import com.hmy.advance.service.UserValidator;
import org.springframework.stereotype.Service;

@Service
public class UserValidatorImpl implements UserValidator {

    @Override
    public Boolean validate(User user) {
        System.out.println("引入新的接口"+UserValidator.class.getSimpleName());
        return user!=null;
    }
}
