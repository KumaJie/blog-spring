package cqut.blogspring.dao;

import cqut.blogspring.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Kuma
 * @date 2021年6月1日
 */
@Mapper
public interface ArticleDao {

    /**
     * 根据文章ID获取相应文章
     * @param articleId 文章id
     * @return 返回文章内容
     */
    Article selectById(String articleId);

    /**
     * 返回该id用户的所有文章
     * @param userId 用户id
     * @return 文章集合
     */
    List<Article> selectListByUserId(String userId);

    /**
     * 根据浏览量返回所有文章
     * @return 所有文章
     */
    List<Article> selectListByView();

    /**
     * 返回所有文章
     * @return 所有文章
     */
    List<Article> selectList();

    /**
     * 插入新文章
     * @param blog 待上传的文章
     * @return 是否成功
     */
    boolean insert(Article blog);

    /**
     * 根据文章ID删除文章
     * @param articleId 文章ID
     * @return  是否成功
     */
    boolean deleteById(String articleId);

    /**
     * 增加浏览量
     * @param articleId 文章ID
     * @return 是否成功
     */
    boolean updateViewById(String articleId);

    /**
     * 增加评论数
     * @param articleId 文章ID
     * @return 是否成功
     */
    boolean updateLikeById(String articleId);

    /**
     * 根据文章ID查询评论总数
     * @param articleId 文章ID
     * @return 总数
     */
    Integer selectCommentById(String articleId);

    /**
     * 修改博客内容
     * @param blog 修改的内容
     * @return 是否成功
     */
    boolean modifyContent(Article blog);
}
