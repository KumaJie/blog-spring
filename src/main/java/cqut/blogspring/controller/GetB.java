package cqut.blogspring.controller;

import cqut.blogspring.dao.ArticleDao;
import cqut.blogspring.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class GetB {
    final private ArticleDao articleDao;

    @Autowired
    public GetB(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
    @GetMapping("/findById")
    public List<Article> findBlog(@Param("id")String id){
        return articleDao.selectListByUserId(id);
    }
    @PostMapping("/add")
    public String addBlog(@RequestBody Article article){
        article.setArticleId(article.createArticleId(article.getUserId()));
        boolean b = articleDao.insert(article);
        return ""+b;
    }
}
