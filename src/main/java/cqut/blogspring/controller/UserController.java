package cqut.blogspring.controller;

import cqut.blogspring.dao.UserDao;
import cqut.blogspring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kuma
 * @date 2021年6月3日
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    final private UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){
        User userInfo = userDao.selectById(user);
        return userInfo;

    }
    @PostMapping("/regist")
    public String regist(@RequestBody User user){
        boolean res = userDao.insert(user);
        return "" + res;
    }

}
