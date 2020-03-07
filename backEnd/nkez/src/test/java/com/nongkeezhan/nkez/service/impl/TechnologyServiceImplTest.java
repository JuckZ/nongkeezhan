package com.nongkeezhan.nkez.service.impl;

import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.Technology;
import com.nongkeezhan.nkez.pojo.TechnologyKey;
import com.nongkeezhan.nkez.service.TechnologyService;
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
public class TechnologyServiceImplTest {

    @Autowired
    private TechnologyService technologyService;

    @Test
    public void getTechnologyList() {
        QueryPage queryPage = new QueryPage();
        queryPage.setPageNum(1);
        queryPage.setPageSize(1);
        System.out.println(technologyService.getTechnologyList(queryPage));
    }

    @Test
    public void getTechnology() {
        Technology technology = new Technology();
        technology.setTechologyId("1");
        System.out.println(technologyService.getTechnology(technology));
    }

//    @Test
//    public void addTechnology() {
//        Technology technology = new Technology();
//        technology.setTechologyId("测试");
//        technology.setTechologyPicture("22");
//        technology.setTechologyTitle("测试标题");
//        technology.setProfessorId("3");
//        technologyService.addTechnology(technology);
//    }

    @Test
    public void deleteTechnology() {
        TechnologyKey technologyKey = new TechnologyKey();
        technologyKey.setProfessorId("3");
        technologyKey.setTechologyId("1551688633536313977");
        technologyService.deleteTechnology(technologyKey);
    }

//    @Test
//    public void updateTechnology() {
//        Technology technology = new Technology();
//        technology.setTechologyId("1");
//        Technology technology2 = technologyService.getTechnology(technology);
//        technology2.setTechologyTitle("更新");
//        technologyService.updateTechnology(technology2);
//    }
}