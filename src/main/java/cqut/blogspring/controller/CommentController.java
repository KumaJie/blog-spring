package cqut.blogspring.controller;

import cqut.blogspring.dao.CommentDao;
import cqut.blogspring.pojo.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kuma
 * @date 2021年6月5日
 */
@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {
    final CommentDao commentDao;

    public CommentController(CommentDao commentDao) {
        this.commentDao = commentDao;
    }
    @PostMapping("/add")
    public String insert(@RequestBody Comment comment){
        return ""+commentDao.insert(comment);
    }
    @GetMapping("/findListByArticleId")
    public List<Comment> showComment(@RequestParam("articleId") String articleId){
        return commentDao.selectListByArticleId(articleId);
    }

    @GetMapping("/addLike")
    public String like(@RequestParam("commentId") String commentId){
        return ""+commentDao.modifyLike(commentId);
    }


}
