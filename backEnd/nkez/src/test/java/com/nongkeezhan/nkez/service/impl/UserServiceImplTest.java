package com.nongkeezhan.nkez.service.impl;

import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by hugay on 2019/2/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserList() {
        QueryPage queryPage = new QueryPage();
        queryPage.setPageNum(1);
        queryPage.setPageSize(1);
        System.out.println(userService.getUserList(queryPage));
    }

    @Test
    public void getUser() {
        User user = userService.getUser("1");
        System.out.println(user);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserId("3");
        user.setUserAccount("111111");
        user.setUserBirthday(new Date());
        user.setUserEmail("@123");
        user.setUserPassword("123");
        user.setUserPhone("123456789");
        user.setUserLiuyan("hhh");
        userService.addUser(user);
    }

    @Test
    public void deleteUser() {
        userService.deleteUser("1");
    }

    @Test
    public void updateUser() {
        User user = userService.getUser("2");
        System.out.println(user);
        user.setUserAccount("hulin");
        userService.updateUser(user);
}
}