package cqut.blogspring.controller;

import cqut.blogspring.dao.ArticleDao;
import cqut.blogspring.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
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

    @GetMapping("findById")
    public Article find(@RequestParam("articleId") String articleId){
        return articleDao.selectById(articleId);
    }

    @GetMapping("/findListById")
    public List<Article> findBlog(@RequestParam("userId")String userId){
        List<Article> allArticle = articleDao.selectListByUserId(userId);
        for (Article art : allArticle){
            Integer sum = articleDao.selectCommentById(art.getArticleId());
            if (sum == null){
                art.setCommentSum(0);
            }else {
                art.setCommentSum(sum);
            }
        }
        return allArticle;
    }
    @GetMapping("/findListByView")
    public List<Article> findByView(){
        List<Article> allArticle = articleDao.selectListByView();
        for (Article art : allArticle){
            Integer sum = articleDao.selectCommentById(art.getArticleId());
            if (sum == null){
                art.setCommentSum(0);
            }else {
                art.setCommentSum(sum);
            }
        }

        return allArticle;
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
    @GetMapping("deleteById")
    public String deleteArticle(@RequestParam("articleId") String articleId){
        return ""+articleDao.deleteById(articleId);
    }
    @PostMapping("modifyContent")
    public String modifyContent(@RequestBody Article article){
        return ""+articleDao.modifyContent(article);
    }
    @PostMapping("upLoadImg")
    public String upLoadImg(MultipartFile img) throws Exception{
        String url;
        String rootPath = this.getClass().getClassLoader().getResource("static").getPath();
        String targetPath = "http://localhost:8085/images/";
        img.transferTo(new File(rootPath, img.getOriginalFilename()));
        url = targetPath+img.getOriginalFilename();
        return url;
    }
}
