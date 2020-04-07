package com.hmy.advance.sqltest;

import com.alibaba.fastjson.JSONArray;
import com.hmy.advance.mapper.WorldMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;



    @Test
    public void oneSqlSession(){

        SqlSession sqlSession = null;
        try{
            sqlSession = sqlSessionFactory.openSession();
            WorldMapper mapper = sqlSession.getMapper(WorldMapper.class);
            List<Map<String, Object>> all = mapper.getAll(1);
            System.out.println(JSONArray.toJSONString(all));

            System.out.println("=============开始同一个 Sqlsession 的第二次查询============");
            List<Map<String, Object>> all2 = mapper.getAll(2);
            System.out.println(JSONArray.toJSONString(all2));


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
