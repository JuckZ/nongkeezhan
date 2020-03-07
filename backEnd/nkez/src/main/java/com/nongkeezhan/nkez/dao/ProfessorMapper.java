package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.ProfessorDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Professor;
import com.nongkeezhan.nkez.pojo.ProfessorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessorMapper {
    int countByExample(ProfessorExample example);

    int deleteByExample(ProfessorExample example);

    int deleteByPrimaryKey(String professorId);

    int insert(Professor record);

    int insertSelective(Professor record);

    List<Professor> selectByExample(ProfessorExample example);

    Professor selectByPrimaryKey(String professorId);

    int updateByExampleSelective(@Param("record") Professor record, @Param("example") ProfessorExample example);

    int updateByExample(@Param("record") Professor record, @Param("example") ProfessorExample example);

    int updateByPrimaryKeySelective(Professor record);

    int updateByPrimaryKey(Professor record);

    List<ProfessorDTO> listAll();

    List<ProfessorDTO> listByCategory(String professorCategory);

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