package com.hmy.advance.service.impl;

import com.hmy.advance.mapper.WorldMapper;
import com.hmy.advance.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WorldServiceImpl implements WorldService {

    @Autowired
    private WorldMapper worldMapper;

    @Override
    public List<Map<String,Object>> getAll() {
        return worldMapper.getAll(1);
    }
}
