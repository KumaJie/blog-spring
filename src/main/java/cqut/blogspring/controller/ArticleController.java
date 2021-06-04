package cqut.blogspring.controller;

import cqut.blogspring.dao.ArticleDao;
import cqut.blogspring.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
    final private ArticleDao articleDao;

    @Autowired
    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @PostMapping("findById")
    public Article find(@RequestParam("articleId") String articleId){
        return articleDao.selectById(articleId);
    }

    @GetMapping("/findListById")
    public List<Article> findBlog(@RequestParam("id")String id){
        return articleDao.selectListByUserId(id);
    }
    @PostMapping("/findListByView")
    public List<Article> findByView(){
        return articleDao.selectListByView();
    }

    @PostMapping("/add")
    public String addBlog(@RequestBody Article article){
//       建立编号
        article.createArticleId();
        boolean b = articleDao.insert(article);
        return ""+b;
    }
    @GetMapping("updateView")
    public String addView(@RequestParam("articleId") String articlId){
        return "" + articleDao.updateViewById(articlId);
    }
    @GetMapping("updateLike")
    public String addLike(@RequestParam("articleId") String articleId){
        return "" + articleDao.updateLikeById(articleId);
    }
}
