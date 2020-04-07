package com.hmy.advance.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface WorldMapper {

    public List<Map<String,Object>> getAll(int id);
}
