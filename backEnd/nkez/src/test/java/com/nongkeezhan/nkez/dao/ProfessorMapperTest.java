package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.ProfessorDTO;
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
public class ProfessorMapperTest {

    @Autowired
    private ProfessorMapper professorMapper;

    @Test
    public void listAll() {
        System.out.println(professorMapper.listAll());
    }

    @Test
    public void listByCategory() {
        System.out.println(professorMapper.listByCategory("植物保护"));
    }

    @Test
    public void getProfessorByParam() {
        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfessorName("李");
        System.out.println(professorMapper.getProfessorByParam(professorDTO));
    }
}