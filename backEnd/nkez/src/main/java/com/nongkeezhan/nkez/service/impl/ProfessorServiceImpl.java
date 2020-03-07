package com.nongkeezhan.nkez.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.constants.Exception.CommonException;
import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.dao.ProfessorMapper;
import com.nongkeezhan.nkez.dao.UserMapper;
import com.nongkeezhan.nkez.pojo.DTO.ProfessorDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Professor;
import com.nongkeezhan.nkez.pojo.ProfessorExample;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.UserExample;
import com.nongkeezhan.nkez.service.ProfessorService;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.KeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hugay on 2019/2/27
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorMapper professorMapper;


    @Override
    public PageInfo<ProfessorDTO> getProfessorList(QueryPage queryPage) {
        PageHelper.startPage(queryPage.getPageNum(),queryPage.getPageSize());
        return new PageInfo<>(professorMapper.listAll());
    }

    @Override
    public PageInfo<ProfessorDTO> getProfessorListByCategory(String category,QueryPage queryPage) {
        PageHelper.startPage(queryPage.getPageNum(),queryPage.getPageSize());
        return new PageInfo<>(professorMapper.listByCategory(category));
    }

    @Override
    public Professor getProfessor(String professorId) {
        Professor exist = this.professorMapper.selectByPrimaryKey(professorId);
        if (null==exist){
            throw new CommonException(ResultEnum.PROFESSOR_FIND_ERROR.getCode(), ResultEnum.PROFESSOR_FIND_ERROR.getMessage());
        }
        return exist;
    }

    @Override
    public void addProfessor(Professor professor) {
        ProfessorExample professorExample = new ProfessorExample();
        professorExample.or().andProfessorIdEqualTo(professor.getProfessorId());
        List<Professor> list = professorMapper.selectByExample(professorExample);
        if (!list.isEmpty()) {
            throw new CommonException(ResultEnum.PROFESSOR_ADD_ERROR.getCode()
                    , ResultEnum.PROFESSOR_ADD_ERROR.getMessage());
        } else {
            professor.setProfessorId(KeyUtils.genUniqueKey());
            professorMapper.insertSelective(professor);
        }
    }

    @Override
    public void deleteProfessor(String professorId) {
        Professor professor = this.professorMapper.selectByPrimaryKey(professorId);
        if (null == professor) {
            throw new CommonException(ResultEnum.PROFESSOR_DELETE_ERROR.getCode(), ResultEnum.PROFESSOR_DELETE_ERROR.getMessage());
        } else {
            this.professorMapper.deleteByPrimaryKey(professorId);
        }
    }

    @Override
    public void updateProfessor(Professor professor) {
        ProfessorExample professorExample = new ProfessorExample();
        professorExample.or().andProfessorIdEqualTo(professor.getProfessorId());
        List<Professor> list = professorMapper.selectByExample(professorExample);
        if (list.isEmpty()) {
            throw new CommonException(ResultEnum.PROFESSOR_UPDATE_ERROR.getCode(), ResultEnum.PROFESSOR_UPDATE_ERROR.getMessage());
        } else {
            this.professorMapper.updateByPrimaryKeySelective(professor);
        }
    }

    @Override
    public List<ProfessorDTO> getProfessorByParam(ProfessorDTO professorDTO) {
        PageHelper.startPage(professorDTO.getQueryPage().getPageNum(),professorDTO.getQueryPage().getPageSize());
        return professorMapper.getProfessorByParam(professorDTO);
    }
}
