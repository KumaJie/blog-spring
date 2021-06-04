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
     * 根据文章标题删除文章
     * @param articleTitle 文章标题
     * @return  是否成功
     */
    boolean deleteByTitle(String articleTitle);

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
}
