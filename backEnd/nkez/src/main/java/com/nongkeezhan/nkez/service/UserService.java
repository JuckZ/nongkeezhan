package com.nongkeezhan.nkez.service;

import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by hugay on 2019/2/27
 */
public interface UserService {

    /**
     * 查询所有用户列表
     * @param queryPage
     * @return
     */
    PageInfo<UserDTO> getUserList(QueryPage queryPage);

    /**
     * 根据用户ID来查询某个用户
     * @param userID
     * @return
     */
    public User getUser(String userID);

    /**
     * 添加用户或者用户注册
     * @param user
     */
    public void addUser(User user);

    /**
     * 通过UserID来删除用户
     * @param userId
     */
    public void deleteUser(String userId);

    /**
     *修改用户对象的信息，传入一个用户对象，进行可选择性的修改
     * @param user
     */
    public void updateUser(User user);


    /**
     * 1.根据用户ID查找对应的用户
     * 2.根据用户账户查找对应用户
     * 3.根据用户邮箱查找对应用户
     * 4.根据用户电话查找用户
     * 5.根据用户生日查找用户
     * 6.根据用户留言查找用户
     * @param userDTO
     * @return
     */
    List<UserDTO> getUserByParam(UserDTO userDTO);

    public boolean userLogin(String userAccount,String userPassword);
}
