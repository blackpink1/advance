package com.hmy.advance.controller;


import com.hmy.advance.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public Map<String,Object> login(HttpServletRequest request,String userName,String password){
        Map<String,Object> map = new HashMap<String,Object>();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
            map.put("statusCode","000000");
            map.put("msg","登录成功");
        }catch (IncorrectCredentialsException ice){
            map.put("statusCode","000001");
            map.put("msg","密码不正确");
        }catch (UnknownAccountException uae){
            map.put("statusCode","000002");
            map.put("msg","用户不存在");
        }catch (AuthenticationException ae){
            map.put("statusCode","000003");
            map.put("msg","此用户被禁用");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "unauth",method = RequestMethod.GET)
    public Map<String,Object> unauth(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("statusCode","000011");
        map.put("msg","未登录！");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "unauthor",method = RequestMethod.GET)
    public Map<String,Object> unauthor(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("statusCode","000012");
        map.put("msg","无操作权限！");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "kickout",method = RequestMethod.GET)
    public Map<String,Object> kickout(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("statusCode","000013");
        map.put("msg","被其他用户挤掉！");
        return map;
    }
}
