package com.nongkeezhan.nkez.controller;

import com.nongkeezhan.nkez.pojo.DTO.NewsDTO;
import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.News;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;
import com.nongkeezhan.nkez.service.NewsService;
import com.nongkeezhan.nkez.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hugay on 2019/3/4
 */
@RestController
@RequestMapping("/nkezApi/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 添加新闻，传入一个新闻对象
     * @param news
     * @return
     */
    @RequestMapping("/news_add")
    public ResultVO newsAdd(@RequestBody News news){
        newsService.addNews(news);
        return ResultVOUtil.success();
    }

    /**
     * 传入新闻Id，删除指定的新闻
     * @param news
     * @return
     */
    @RequestMapping("/news_delete")
    public ResultVO newsDelete(@RequestBody News news){
        String id = news.getNewsId();
        this.newsService.deleteNews(id);
        return ResultVOUtil.success();
    }

    /**
     * 传入具有更新信息的新闻对象
     * !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！
     * @param news
     * @return
     */
    @RequestMapping("/news_update")
    public ResultVO newsUpdate(@RequestBody News news){
        this.newsService.updateNews(news);
        return ResultVOUtil.success();
    }

    /**
     * 分页
     * @param queryPage
     * @return
     */
    @RequestMapping("/news_list")
    public ResultVO newsList(@RequestBody QueryPage queryPage){
        return ResultVOUtil.success(newsService.getNewsList(queryPage));
    }

    /**
     * 获取某个单个的新闻
     * @param news
     * @return
     */
    @RequestMapping("/get_news")
    public ResultVO getNews(@RequestBody News news){
        this.newsService.getNews(news.getNewsId());
        return ResultVOUtil.success();
    }

    @RequestMapping("/news_search")
    public ResultVO newsSearch(@RequestBody NewsDTO newsDTO){
        return ResultVOUtil.success(this.newsService.getNewsByParam(newsDTO));
    }
}
