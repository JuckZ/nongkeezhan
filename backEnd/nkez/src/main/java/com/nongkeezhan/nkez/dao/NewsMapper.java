package com.nongkeezhan.nkez.dao;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.pojo.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(String newsId);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(String newsId);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<NewsDTO> listAll();

    /**
     * 1.根据新闻ID查找对应的新闻
     * 2.根据新闻标题查找对应新闻
     * 3.根据新闻内容查找对应新闻
     * 4.根据新闻来源查找新闻
     * @param newsDTO
     * @return
     */
    List<NewsDTO> getNewsByParam(NewsDTO newsDTO);
}