package com.hmy.advance.controller;

import com.hmy.advance.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/world")
public class WorldController {
    @Autowired
    private WorldService worldService;

    @ResponseBody
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public Map<String,Object> getAll(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        List<Map<String, Object>> list = worldService.getAll();
        map.put("data",list);
        return map;
    }
}
