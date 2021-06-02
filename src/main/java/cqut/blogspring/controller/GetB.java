package cqut.blogspring.controller;

import cqut.blogspring.dao.ArticleDao;
import cqut.blogspring.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class GetB {
    final private ArticleDao articleDao;

    @Autowired
    public GetB(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
    @GetMapping("/find")
    public Article findBlog(@Param("id")String id){
        return articleDao.getArticle(id);
    }
    @PostMapping("/add")
    public String addBlog(@RequestBody Article article){
        article.setArticleId(article.createArticleId(article.getUserId()));
        article.setArticleDate("2020-01-02");
        System.out.println(article);
        boolean b = articleDao.uploadArticle(article);
        return ""+b;
    }
}
