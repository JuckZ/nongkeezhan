package com.nongkeezhan.nkez.service.impl;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.service.NewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hugay on 2019/3/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest {

    @Autowired
    private NewsService newsService;

    @Test
    public void getNewsList() {
        QueryPage queryPage = new QueryPage();
        queryPage.setPageNum(1);
        queryPage.setPageSize(2);
        System.out.println(newsService.getNewsList(queryPage));
    }

    @Test
    public void getNews() {
        News news = newsService.getNews("1");
        System.out.println(news);
    }

    @Test
    public void addNews() {
        News news = new News();
        news.setNewsId("test");
        news.setNewsBody("测试新闻用例");
        news.setNewsPicture("---");
        news.setNewsSource("测试网");
        news.setNewsTitle("新闻测试");
        newsService.addNews(news);
    }

    @Test
    public void deleteNews() {
        newsService.deleteNews("1551416475184949187");
    }

    @Test
    public void updateNews() {
        News news = new News();
        news.setNewsId("test");
        news.setNewsBody("测试新闻用例");
        news.setNewsPicture("---");
        news.setNewsSource("测试网");
        news.setNewsTitle("新闻测试");
        newsService.addNews(news);
        news.setNewsTitle("lalalal");
        newsService.updateNews(news);
    }

    @Test
    public void getNewsByParam() {
        NewsDTO newsDTO = new NewsDTO();
        QueryPage queryPage = new QueryPage();
        queryPage.setPageSize(2);
        queryPage.setPageNum(1);
        newsDTO.setQueryPage(queryPage);
        newsDTO.setNewsBody("10月");
        System.out.println(newsService.getNewsByParam(newsDTO));
    }
}