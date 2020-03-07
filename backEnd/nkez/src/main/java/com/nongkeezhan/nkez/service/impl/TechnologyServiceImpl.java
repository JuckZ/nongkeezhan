package com.nongkeezhan.nkez.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.constants.Exception.CommonException;
import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.dao.TechnologyMapper;
import com.nongkeezhan.nkez.dao.UserMapper;
import com.nongkeezhan.nkez.pojo.*;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.TechnologyDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.service.TechnologyService;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.KeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hugay on 2019/2/27
 */
@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private TechnologyMapper technologyMapper;


    @Override
    public PageInfo<TechnologyDTO> getTechnologyList(QueryPage queryPage) {
        PageHelper.startPage(queryPage.getPageNum(),queryPage.getPageSize());
        return new PageInfo<>(technologyMapper.listAll());
    }

    @Override
    public Technology getTechnology(Technology technology) {
        TechnologyExample technologyExample = new TechnologyExample();
        technologyExample.or().andTechologyIdEqualTo(technology.getTechologyId());
        List<Technology> list= this.technologyMapper.selectByExample(technologyExample);
        if (null==list){
            throw new CommonException(ResultEnum.TECHNOLOGY_FIND_ERROR.getCode(), ResultEnum.TECHNOLOGY_FIND_ERROR.getMessage());
        }
        return list.get(0);
    }

    @Override
    public void addTechnology(TechnologyDTO technology) {
        TechnologyExample technologyExample = new TechnologyExample();
        technologyExample.or().andProfessorIdEqualTo(technology.getTechologyId());
        List<Technology> list= this.technologyMapper.selectByExample(technologyExample);
        if (!list.isEmpty()) {
            throw new CommonException(ResultEnum.TECHNOLOGY_ADD_ERROR.getCode()
                    , ResultEnum.TECHNOLOGY_ADD_ERROR.getMessage());
        } else {
            technology.setTechologyId(KeyUtils.genUniqueKey());
            Technology technology1 = new Technology();
            technology1.setTechologyId(KeyUtils.genUniqueKey());
            technology1.setTechologyTitle(technology.getTechologyTitle());
            technology1.setTechologyPicture(technology.getTechologyPicture());
            technology1.setProfessorId(technology.getProfessorId());
            technologyMapper.insertSelective(technology1);
        }

    }

    @Override
    public void deleteTechnology(TechnologyKey technologyKey) {
        Technology technology = this.technologyMapper.selectByPrimaryKey(technologyKey);
        if (null == technology) {
            throw new CommonException(ResultEnum.TECHNOLOGY_DELETE_ERROR.getCode(), ResultEnum.TECHNOLOGY_DELETE_ERROR.getMessage());
        } else {
            this.technologyMapper.deleteByPrimaryKey(technologyKey);
        }
    }

    @Override
    public void updateTechnology(TechnologyDTO technology) {
        TechnologyExample technologyExample = new TechnologyExample();
        technologyExample.or().andTechologyIdEqualTo(technology.getTechologyId());
        List<Technology> list= this.technologyMapper.selectByExample(technologyExample);
        if (list.isEmpty()) {
            throw new CommonException(ResultEnum.TECHNOLOGY_UPDATE_ERROR.getCode(), ResultEnum.TECHNOLOGY_UPDATE_ERROR.getMessage());
        } else {
            Technology technology1 = new Technology();
            technology1.setTechologyTitle(technology.getTechologyTitle());
            technology1.setTechologyPicture(technology.getTechologyPicture());
            technology1.setProfessorId(technology.getProfessorId());
            this.technologyMapper.updateByPrimaryKeySelective(technology1);
        }
    }

    @Override
    public List<TechnologyDTO> getTechnologyByParam(TechnologyDTO technologyDTO) {
        PageHelper.startPage(technologyDTO.getQueryPage().getPageNum(),technologyDTO.getQueryPage().getPageSize());
        return technologyMapper.getTechnologyByParam(technologyDTO);
    }
}
