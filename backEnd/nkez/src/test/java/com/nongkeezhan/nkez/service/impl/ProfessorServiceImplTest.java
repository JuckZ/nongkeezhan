package com.nongkeezhan.nkez.service.impl;

import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.Professor;
import com.nongkeezhan.nkez.service.ProfessorService;
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
public class ProfessorServiceImplTest {

    @Autowired
    private ProfessorService professorService;

    @Test
    public void getProfessorList() {
        QueryPage queryPage = new QueryPage();
        queryPage.setPageNum(1);
        queryPage.setPageSize(1);
        System.out.println(professorService.getProfessorList(queryPage));
    }

    @Test
    public void getProfessorListByCategory() {
        QueryPage queryPage = new QueryPage();
        queryPage.setPageNum(1);
        queryPage.setPageSize(1);
        String category = "植物保护";
        professorService.getProfessorListByCategory(category,queryPage);
    }

    @Test
    public void getProfessor() {
        System.out.println(professorService.getProfessor("2"));
    }

    @Test
    public void addProfessor() {
        Professor professor = new Professor();
        professor.setProfessorId("测试id");
        professor.setProfessorCategory("测试类别");
        professor.setProfessorName("测试姓名");
        professor.setProfessorPicture("测试图片");
        professor.setProfessorPosition("测试职称");
        professor.setProfessorYjfx("测试研究方向");
        professor.setProfessorZl("测试资料");
        professorService.addProfessor(professor);
    }

    @Test
    public void deleteProfessor() {
        professorService.deleteProfessor("1551676010285395871");
    }

    @Test
    public void updateProfessor() {
        Professor professor = professorService.getProfessor("1551676010285395871");
        professor.setProfessorName("hugay");
        professorService.updateProfessor(professor);
    }
}