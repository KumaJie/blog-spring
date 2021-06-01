package cqut.blogspring.pojo;

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
    private String articleView;
    private String articleLike;

    public Article(){}

    public Article(String articleId, String userId, String categoriesId, String articleTitle, String articleContent, String articleDate, String articleView, String articleLike) {
        this.articleId = articleId;
        this.userId = userId;
        this.categoriesId = categoriesId;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleDate = articleDate;
        this.articleView = articleView;
        this.articleLike = articleLike;
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

    public String getArticleView() {
        return articleView;
    }

    public void setArticleView(String articleView) {
        this.articleView = articleView;
    }

    public String getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(String articleLike) {
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
                ", articleView='" + articleView + '\'' +
                ", articleLike='" + articleLike + '\'' +
                '}';
    }
}
