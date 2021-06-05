package cqut.blogspring.pojo;

/**
 * @author Kuma
 * @date 2021年6月5日
 */
public class Comment {
    private int commentId;
    private String userId;
    private String articleId;
    private String commentContent;
    private int commentLike;
    private String commentDate;

    public Comment() {
    }

    public Comment(int commentId, String userId, String articleId, String commentContent, int commentLike, String commentDate) {
        this.commentId = commentId;
        this.userId = userId;
        this.articleId = articleId;
        this.commentContent = commentContent;
        this.commentLike = commentLike;
        this.commentDate = commentDate;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(int commentLike) {
        this.commentLike = commentLike;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId='" + userId + '\'' +
                ", articleId='" + articleId + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentLike=" + commentLike +
                ", commentDate='" + commentDate + '\'' +
                '}';
    }
}
