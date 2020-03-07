package com.nongkeezhan.nkez.service;

import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.TechnologyDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Technology;
import com.nongkeezhan.nkez.pojo.TechnologyKey;
import com.nongkeezhan.nkez.pojo.User;

import java.util.List;

/**
 * Created by hugay on 2019/2/27
 */
public interface TechnologyService {

    /**
     * 查询所有技术列表
     * @param queryPage
     * @return
     */
    PageInfo<TechnologyDTO> getTechnologyList(QueryPage queryPage);

    /**
     * 根据技术ID来查询某个技术
     * @param technology
     * @return
     */
    public Technology getTechnology(Technology technology);

    /**
     * 添加技术
     * @param technologyDTO
     */
    public void addTechnology(TechnologyDTO technologyDTO);

    /**
     * 通过technologyId来删除技术
     * @param technologyKey
     */
    public void deleteTechnology(TechnologyKey technologyKey);

    /**
     *修改技术对象的信息，传入一个技术对象，进行可选择性的修改
     * @param technology
     */
    public void updateTechnology(TechnologyDTO technology);

    /**
     * 1.根据技术ID查找对应的技术
     * 2.根据技术标题查找对应技术
     * 3.根据技术对应的专家查找技术
     * @param technologyDTO
     * @return
     */
    List<TechnologyDTO> getTechnologyByParam(TechnologyDTO technologyDTO);


}
