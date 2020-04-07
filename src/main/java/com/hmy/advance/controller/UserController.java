package com.hmy.advance.controller;

import com.hmy.advance.pojo.User;
import com.hmy.advance.service.UserService;
import com.hmy.advance.service.UserValidator;
import com.hmy.advance.service.impl.RedisService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RedisService redisService;

    @ResponseBody
    @RequestMapping(value = "save",method = RequestMethod.GET)
    @RequiresPermissions("save")
    public Map<String,Object> save(User user){
        Map<String,Object> map = new HashMap<String,Object>();
        userService.save(user);
        map.put("msg","操作成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "validator",method = RequestMethod.GET)
    public Map<String,Object> validator (User user){
        Map<String,Object> map = new HashMap<String,Object>();
        //强制转换
        UserValidator userValidator = (UserValidator) userService;
        //验证用户是否为空
        if(userValidator.validate(user)){
            userService.save(user);
        }
        map.put("msg","操作成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "getRedis",method = RequestMethod.GET)
    public Map<String,Object> getRedis (User user){
        Map<String,Object> map = new HashMap<String,Object>();
        redisService.set("paramKey","恭喜你成功了");
        map.put("data",redisService.get("paramKey"));
        map.put("msg","操作成功");
        return map;
    }


}
