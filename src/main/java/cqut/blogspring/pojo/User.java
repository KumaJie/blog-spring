package cqut.blogspring.pojo;

/**
 * @author Kuma
 * @date 2021年6月1日
 */
public class User {
    private String userId;
    private String userName;
    private String userPwd;
    private String userImg;
    private String userDate;
    private String userPower;

    public User(){}

    public User(String userId, String userName, String userPwd, String userImg, String userDate, String userPower) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userImg = userImg;
        this.userDate = userDate;
        this.userPower = userPower;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userImg='" + userImg + '\'' +
                ", userDate='" + userDate + '\'' +
                ", userPower='" + userPower + '\'' +
                '}';
    }
}
