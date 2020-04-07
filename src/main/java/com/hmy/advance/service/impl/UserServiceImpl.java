package com.hmy.advance.service.impl;

import com.hmy.advance.pojo.User;
import com.hmy.advance.service.UserService;
import com.hmy.advance.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public void save(User user) {
        System.out.println("ID：" + user.getId() + ",名字：" + user.getUserName() + ",性别：" + user.getSex());
    }

    @Override
    public User getUserByName(String userName) {
        if (userName.equals("hmy")) {
            User user = new User();
            user.setId(1);
            user.setPassword(StringUtil.string2MD5("123456"));
            user.setSex(1);
            user.setUserName("hmy");
            user.setStatus(1);
            return user;
        }
        return null;
    }
}
