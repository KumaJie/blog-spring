package cqut.blogspring.dao;

import cqut.blogspring.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Kuma
 * @date 2021年6月2日
 */
@Mapper
public interface UserDao {
    /**
     * 用户注册
     * @param user 用户信息
     * @return 是否成功
     */
    boolean insert(User user);

    /**
     * 用户登录
     * @param user 用户帐号密码
     * @return 用户信息
     */
    User selectById(User user);

    /**
     * 修改密码
     * @param id 用户id
     * @param pwd 新密码
     * @return 是否成功
     */
    boolean modifyPwd(String id, String pwd);

    /**
     * 修改头像
     * @param id 用户id
     * @param img 新头像
     * @return 是否成功
     */
    boolean modifyImg(String id, String img);
}
