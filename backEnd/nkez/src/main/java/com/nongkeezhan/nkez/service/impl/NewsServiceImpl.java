package com.nongkeezhan.nkez.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nongkeezhan.nkez.constants.Exception.CommonException;
import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.dao.NewsMapper;
import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.pojo.NewsExample;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.UserExample;
import com.nongkeezhan.nkez.service.NewsService;
import com.nongkeezhan.nkez.utils.KeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hugay on 2019/3/1
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public PageInfo<NewsDTO> getNewsList(QueryPage queryPage) {
        PageHelper.startPage(queryPage.getPageNum(),queryPage.getPageSize());
        return new PageInfo<>(newsMapper.listAll());
    }

    @Override
    public News getNews(String newsID) {
        News exist = this.newsMapper.selectByPrimaryKey(newsID);
        if (null==exist){
            throw new CommonException(ResultEnum.NEWS_FIND_ERROR.getCode(), ResultEnum.NEWS_FIND_ERROR.getMessage());
        }
        return exist;
    }

    @Override
    public void addNews(News news) {
        NewsExample newsExample = new NewsExample();
        newsExample.or().andNewsIdEqualTo(news.getNewsId());
        List<News> list = newsMapper.selectByExample(newsExample);
        if (!list.isEmpty()) {
            throw new CommonException(ResultEnum.NEWS_ADD_ERROR.getCode()
                    , ResultEnum.NEWS_ADD_ERROR.getMessage());
        } else {
            news.setNewsId(KeyUtils.genUniqueKey());
            newsMapper.insertSelective(news);
        }
    }

    @Override
    public void deleteNews(String newsId) {
        News news = this.newsMapper.selectByPrimaryKey(newsId);
        if (null == news) {
            throw new CommonException(ResultEnum.NEWS_DELETE_ERROR.getCode(), ResultEnum.NEWS_DELETE_ERROR.getMessage());
        } else {
            this.newsMapper.deleteByPrimaryKey(newsId);
        }
    }

    @Override
    public void updateNews(News news) {
        NewsExample newsExample = new NewsExample();
        newsExample.or().andNewsIdEqualTo(news.getNewsId());
        List<News> list = newsMapper.selectByExample(newsExample);
        if (list.isEmpty()) {
            throw new CommonException(ResultEnum.NEWS_UPDATE_ERROR.getCode(), ResultEnum.NEWS_UPDATE_ERROR.getMessage());
        } else {
            this.newsMapper.updateByPrimaryKeySelective(news);
        }
    }

    @Override
    public List<NewsDTO> getNewsByParam(NewsDTO newsDTO) {
        PageHelper.startPage(newsDTO.getQueryPage().getPageNum(),newsDTO.getQueryPage().getPageSize());
        return newsMapper.getNewsByParam(newsDTO);
    }
}
