package com.nongkeezhan.nkez.controller;

import com.nongkeezhan.nkez.pojo.DTO.ProfessorDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Professor;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;
import com.nongkeezhan.nkez.service.ProfessorService;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hugay on 2019/3/4
 */
@RestController
@RequestMapping("/nkezApi/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    /**
     * 添加专家，传入一个专家对象
     * @param professor
     * @return
     */
    @RequestMapping("/professor_add")
    public ResultVO professorAdd(@RequestBody Professor professor){
        professorService.addProfessor(professor);
        return ResultVOUtil.success();
    }

    /**
     * 传入专家Id，删除指定的专家
     * @param professor
     * @return
     */
    @RequestMapping("/professor_delete")
    public ResultVO professorDelete(@RequestBody Professor professor){
        String id = professor.getProfessorId();
        this.professorService.deleteProfessor(id);
        return ResultVOUtil.success();
    }

    /**
     * 传入具有更新信息的专家对象
     * !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！
     * @param professor
     * @return
     */
    @RequestMapping("/professor_update")
    public ResultVO professorUpdate(@RequestBody Professor professor){
        this.professorService.updateProfessor(professor);
        return ResultVOUtil.success();
    }

    /**
     * 分页
     * @param queryPage
     * @return
     */
    @RequestMapping("/professor_list")
    public ResultVO newsList(@RequestBody QueryPage queryPage){
        return ResultVOUtil.success(professorService.getProfessorList(queryPage));
    }

    /**
     * 获取某个单个的用户
     * @param professor
     * @return
     */
    @RequestMapping("/get_professor")
    public ResultVO getProfessor(@RequestBody Professor professor){
        this.professorService.getProfessor(professor.getProfessorId());
        return ResultVOUtil.success();
    }

    @RequestMapping("/professor_search")
    public ResultVO professorSearch(@RequestBody ProfessorDTO professorDTO){
        return ResultVOUtil.success(this.professorService.getProfessorByParam(professorDTO));
    }

    @RequestMapping("/get_professor_by_category")
    public  ResultVO getProfessorByCategory(@RequestBody ProfessorDTO professorDTO){
        System.out.println(professorDTO);
        return ResultVOUtil.success(professorService.getProfessorListByCategory(professorDTO.getProfessorCategory(),professorDTO.getQueryPage()));
    }
}
