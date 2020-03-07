package com.nongkeezhan.nkez.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.constants.Exception.CommonException;
import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.dao.UserMapper;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.UserExample;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.KeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.KeyUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by hugay on 2019/2/27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public PageInfo<UserDTO> getUserList(QueryPage queryPage) {
        PageHelper.startPage(queryPage.getPageNum(),queryPage.getPageSize());
        return new PageInfo<>(userMapper.listAll());
    }

    @Override
    public User getUser(String userID) {
        User exist = this.userMapper.selectByPrimaryKey(userID);
        if (null==exist){
            throw new CommonException(ResultEnum.USER_FIND_ERROR.getCode(), ResultEnum.USER_FIND_ERROR.getMessage());
        }
        return exist;
    }

    @Override
    public void addUser(User user) {
        UserExample userExample = new UserExample();
        userExample.or().andUserIdEqualTo(user.getUserId());
        List<User> list = userMapper.selectByExample(userExample);
        if (!list.isEmpty()) {
            throw new CommonException(ResultEnum.USER_REGIST_ERROR.getCode()
                    , ResultEnum.USER_REGIST_ERROR.getMessage());
        } else {
            user.setUserId(KeyUtils.genUniqueKey());
            userMapper.insertSelective(user);
        }

    }

    @Override
    public void deleteUser(String userId) {
        User user = this.userMapper.selectByPrimaryKey(userId);
        if (null == user) {
            throw new CommonException(ResultEnum.USER_DELETE_ERROR.getCode(), ResultEnum.USER_DELETE_ERROR.getMessage());
        } else {
            this.userMapper.deleteByPrimaryKey(userId);
        }
    }

    @Override
    public void updateUser(User user) {
        UserExample userExample = new UserExample();
        userExample.or().andUserIdEqualTo(user.getUserId());
        List<User> list = userMapper.selectByExample(userExample);
        if (list.isEmpty()) {
            throw new CommonException(ResultEnum.USER_UPDATE_ERROR.getCode(), ResultEnum.USER_UPDATE_ERROR.getMessage());
        } else {
            this.userMapper.updateByPrimaryKeySelective(user);
        }
    }

    @Override
    public List<UserDTO> getUserByParam(UserDTO userDTO) {
        PageHelper.startPage(userDTO.getQueryPage().getPageNum(),userDTO.getQueryPage().getPageSize());
        return userMapper.getUserByParam(userDTO);
    }

    @Override
    public boolean userLogin(String userAccount, String userPassword) {
        User user = this.userMapper.userLogin(userAccount,userPassword);
        if(user==null){
            throw new CommonException(ResultEnum.USER_LOGIN_ERROR.getCode(),ResultEnum.USER_LOGIN_ERROR.getMessage());
        }
        return true;
    }
}
