package cqut.blogspring.controller;

import cqut.blogspring.dao.UserDao;
import cqut.blogspring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
        return userDao.selectById(user);

    }
    @PostMapping("/regist")
    public String regist(@RequestBody User user){
        userDao.insert(user);
        return "注册成功";
    }

    @PostMapping("/modifyPwd")
    public boolean modifyPwd(@RequestBody User user){
        return userDao.modifyPwd(user);
    }

    @PostMapping("/modifyImg")
    public String modifyImg(MultipartFile file, User user){
//        保存文件
        String rootPath = this.getClass().getClassLoader().getResource("static").getPath();
        String imgName = file.getOriginalFilename();
        File targetFile = new File(rootPath, imgName);
        String url = "";
        try {
            file.transferTo(targetFile);
            url = "http://localhost:8085/user/getImg?name="+imgName;
            userDao.modifyImg(user.getUserId(), url);
        }catch (IOException e){
            e.printStackTrace();
            return "修改失败";
        }
        return url;
    }

    @GetMapping(value = "/getImg", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImg(@RequestParam("name") String name){
        byte[] img = null;
        String rootPath = this.getClass().getClassLoader().getResource("static").getPath();
        File targetFile = new File(rootPath, name);
        try(FileInputStream in = new FileInputStream(targetFile)){
            img = new byte[in.available()];
            in.read(img, 0, in.available());
        }catch (Exception e){
            e.printStackTrace();
        }
        return img;
    }

}
