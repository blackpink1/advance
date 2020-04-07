package com.hmy.advance.service;

import com.hmy.advance.pojo.User;

public interface UserService {

    public void save(User user);

    public User getUserByName(String userName);
}
