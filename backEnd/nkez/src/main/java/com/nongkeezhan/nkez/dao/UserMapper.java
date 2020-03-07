package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User userLogin(String userAccount,String userPassword);

    List<UserDTO> listAll();

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
}