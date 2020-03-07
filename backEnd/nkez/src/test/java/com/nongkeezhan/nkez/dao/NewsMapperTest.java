package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hugay on 2019/3/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsMapperTest {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    public void listAll() {
        System.out.println(newsMapper.listAll());
    }

    @Test
    public void getNewsByParam() {
        NewsDTO newsDTO = new NewsDTO();
//        newsDTO.setNewsBody("做好秋粮");
//        newsDTO.setNewsTitle("试标题");
        newsDTO.setNewsSource("新华");
        System.out.println(newsMapper.getNewsByParam(newsDTO));
    }
}