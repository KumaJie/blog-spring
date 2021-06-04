package cqut.blogspring.pojo;


import org.apache.ibatis.jdbc.Null;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Kuma
 * @date 2021年6月1日
 */
public class Article {
    private String articleId;
    private String userId;
    private String categoriesId;
    private String articleTitle;
    private String articleContent;
    private String articleDate;
    private int articleView;
    private int articleLike;

    public Article(){}

    public Article(String articleId, String userId, String categoriesId, String articleTitle, String articleContent, String articleDate, int articleView, int articleLike) {
        this.articleId = articleId;
        this.userId = userId;
        this.categoriesId = categoriesId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleDate = articleDate;
        this.articleView = articleView;
        this.articleLike = articleLike;
    }

    public void createArticleId(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        StringBuilder articleId =  new StringBuilder(sdf.format(new Date()));
        Random random=new Random();
        for(int i=0;i<3;i++){
            articleId.append(random.nextInt(10));
        }
        articleId.append(this.userId);
        this.articleId = articleId.toString();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(String categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public int getArticleView() {
        return articleView;
    }

    public void setArticleView(int articleView) {
        this.articleView = articleView;
    }

    public int getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(int articleLike) {
        this.articleLike = articleLike;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", userId='" + userId + '\'' +
                ", categoriesId='" + categoriesId + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleDate='" + articleDate + '\'' +
                ", articleView=" + articleView +
                ", articleLike=" + articleLike +
                '}';
    }
}

