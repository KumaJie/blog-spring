package cqut.blogspring.dao;

import cqut.blogspring.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Kuma
 * @date 2021年6月5日
 */
@Mapper
public interface CommentDao {
    /**
     * 根据用户id以及文章id添加评论
     * @param comment 评论
     * @return 是否成功
     */
    boolean insert(Comment comment);

    /**
     * 返回对应文章的评论
     * @param articleId 文章id
     * @return 所有评论
     */
    List<Comment> selectListByArticleId(String articleId);

    /**
     * 点赞
     * @param commentId 评论id
     * @return 是否成功
     */
    boolean modifyLike(String commentId);
}
