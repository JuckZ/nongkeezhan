package com.nongkeezhan.nkez.service;

import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.pojo.DTO.ProfessorDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Professor;
import com.nongkeezhan.nkez.pojo.User;

import java.util.List;

/**
 * Created by hugay on 2019/3/1
 */
public interface ProfessorService {
    /**
     * 查询所有专家列表
     * @param queryPage
     * @return
     */
    PageInfo<ProfessorDTO> getProfessorList(QueryPage queryPage);

    /**
     * 查询同一类别所有专家列表
     * @param queryPage
     * @return
     */
    PageInfo<ProfessorDTO> getProfessorListByCategory(String category,QueryPage queryPage);


    /**
     * 根据专家ID来查询某个专家
     * @param professorId
     * @return
     */
    public Professor getProfessor(String professorId);

    /**
     * 添加专家
     * @param professor
     */
    public void addProfessor(Professor professor);

    /**
     * 通过professorId来删除用户
     * @param professorId
     */
    public void deleteProfessor(String professorId);

    /**
     *修改用户对象的信息，传入一个用户对象，进行可选择性的修改
     * @param professor
     */
    public void updateProfessor(Professor professor);

    /**
     * 1.根据专家ID查找对应的专家
     * 2.根据专家姓名查找对应专家
     * 3.根据专家职称查找对应专家
     * 4.根据专家研究方向查找专家
     * 5.根据专家资料查找专家
     * 6.根据专家类别查找专家
     * @param professorDTO
     * @return
     */
    List<ProfessorDTO> getProfessorByParam(ProfessorDTO professorDTO);
}
