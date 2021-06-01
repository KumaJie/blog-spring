package cqut.blogspring.dao;

import cqut.blogspring.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Kuma
 * @date 2021年6月1日
 */
@Mapper
public interface ArticleDao {
    /**
     * 上传文章
     * @param blog 待上传的文章
     * @return 是否成功
     */
    boolean uploadArticle(Article blog);

    /**
     * 通过文章id获取相应文章
     * @param articleId 文章id
     * @return 返回文章内容
     */
    Article getArticle(String articleId);
}
