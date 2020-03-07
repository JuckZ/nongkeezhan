package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.TechnologyDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Technology;
import com.nongkeezhan.nkez.pojo.TechnologyExample;
import com.nongkeezhan.nkez.pojo.TechnologyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechnologyMapper {
    int countByExample(TechnologyExample example);

    int deleteByExample(TechnologyExample example);

    int deleteByPrimaryKey(TechnologyKey key);

    int insert(Technology record);

    int insertSelective(Technology record);

    List<Technology> selectByExample(TechnologyExample example);

    Technology selectByPrimaryKey(TechnologyKey key);

    int updateByExampleSelective(@Param("record") Technology record, @Param("example") TechnologyExample example);

    int updateByExample(@Param("record") Technology record, @Param("example") TechnologyExample example);

    int updateByPrimaryKeySelective(Technology record);

    int updateByPrimaryKey(Technology record);

    List<TechnologyDTO> listAll();

    /**
     * 1.根据技术ID查找对应的技术
     * 2.根据技术标题查找对应技术
     * 3.根据技术对应的专家查找技术
     * @param technologyDTO
     * @return
     */
    List<TechnologyDTO> getTechnologyByParam(TechnologyDTO technologyDTO);
}