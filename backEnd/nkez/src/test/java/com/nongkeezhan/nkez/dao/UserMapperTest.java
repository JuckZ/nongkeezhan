package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hugay on 2019/2/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void listAll() {
        System.out.println(userMapper.listAll());
    }

    @Test
    public void selectByPrimaryKey() {
        System.out.println(this.userMapper.selectByPrimaryKey("1"));
    }

    @Test
    public void getUserByParam() {
        UserDTO userDTO = new UserDTO();
//        userDTO.setUserAccount("11");
//        userDTO.setUserEmail("@");
        userDTO.setUserLiuyan("h");
        System.out.println(userMapper.getUserByParam(userDTO));
    }

    @Test
    public void userLogin() {
        String userAccount = "111111";
        String userPassword = "123";
        System.out.println(userMapper.userLogin(userAccount,userPassword));
    }
}