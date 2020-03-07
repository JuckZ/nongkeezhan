package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.TechnologyDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hugay on 2019/3/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TechnologyMapperTest {

    @Autowired
    private TechnologyMapper technologyMapper;

    @Test
    public void listAll() {
        technologyMapper.listAll();
    }

    @Test
    public void getTechnologyByParam() {
        TechnologyDTO technologyDTO = new TechnologyDTO();
        technologyDTO.setTechologyTitle("更");
        System.out.println(technologyMapper.getTechnologyByParam(technologyDTO));
    }
}