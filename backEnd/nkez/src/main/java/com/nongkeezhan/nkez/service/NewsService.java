package com.nongkeezhan.nkez.service;

import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.pojo.User;

import java.util.List;

/**
 * Created by hugay on 2019/2/27
 */
public interface NewsService {

    /**
     * 查询所有新闻，分页显示
     * @param queryPage
     * @return
     */
    PageInfo<NewsDTO> getNewsList(QueryPage queryPage);

    /**
     * 根据新闻ID来查询某个用户
     * @param newsID
     * @return
     */
    public News getNews(String newsID);

    /**
     * 添加新闻
     * @param news
     */
    public void addNews(News news);

    /**
     * 通过NewsID来删除用户
     * @param newsId
     */
    public void deleteNews(String newsId);

    /**
     *修改新闻的信息，传入一个新闻对象，进行可选择性的修改
     * @param news
     */
    public void updateNews(News news);

    /**
     *  1.根据新闻ID查找对应的新闻
     *  2.根据新闻标题查找对应新闻
     *  3.根据新闻内容查找对应新闻
     *  4.根据新闻来源查找新闻
     * @param newsDTO
     * @return
     */
    List<NewsDTO> getNewsByParam(NewsDTO newsDTO);


}
