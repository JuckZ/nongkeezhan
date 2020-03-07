package com.nongkeezhan.nkez.controller;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by hugay on 2019/3/4
 */
@RestController
@RequestMapping("/nkezApi/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户，传入一个用户对象
     * @param user
     * @return
     */
    @RequestMapping("/user_add")
    public ResultVO userAdd(@RequestBody User user){
        userService.addUser(user);
        return ResultVOUtil.success();
    }

    /**
     * 传入用户Id，删除指定的用户
     * @param user
     * @return
     */
    @RequestMapping("/user_delete")
    public ResultVO userDelete(@RequestBody User user){
        String id = user.getUserId();
        this.userService.deleteUser(id);
        return ResultVOUtil.success();
    }

    /**
     * 传入具有更新信息的用户对象
     * !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！
     * @param user
     * @return
     */
    @RequestMapping("/user_update")
    public ResultVO userUpdate(@RequestBody User user){
        this.userService.updateUser(user);
        return ResultVOUtil.success();
    }

    /**
     * 分页
     * @param queryPage
     * @return
     */
    @RequestMapping("/user_list")
    public ResultVO userList(@RequestBody QueryPage queryPage){
        return ResultVOUtil.success(userService.getUserList(queryPage));
    }

    /**
     * 获取某个单个的用户
     * @param user
     * @return
     */
    @RequestMapping("/get_user")
    public ResultVO getUser(@RequestBody User user){
        this.userService.getUser(user.getUserId());
        return ResultVOUtil.success();
    }

    @RequestMapping("/user_search")
    public ResultVO userSearch(@RequestBody UserDTO userDTO){
        return ResultVOUtil.success(this.userService.getUserByParam(userDTO));
    }

    @RequestMapping("/user_registered")
    public ResultVO userRegistered(@RequestBody User user){
        this.userService.addUser(user);
        return ResultVOUtil.success();
    }

    @RequestMapping("/user_login")
    public ResultVO userLogin(@RequestBody User user, HttpSession httpSession){
        if (userService.userLogin(user.getUserAccount(),user.getUserPassword())){
            httpSession.setAttribute("userAccount",user.getUserAccount());
        }
        return ResultVOUtil.success();
    }

}
