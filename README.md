# Easy Blog

## 1. 实体类

- User
- Article

## 2. 接口

1. Article

|       方法名称       |        访问地址        |          用途          |
| :------------------: | :--------------------: | :--------------------: |
|  `selectById()`   |  /article/findById  |  根据文章ID获取文章  |
| `selectListByUserId` |   /article/findListById    | 返回该id用户的所有文章 |
| `selectListByView` |  /article/findListByView  | 根据浏览量返回所有文章 |
|    `selectList()`    |   /article/findList    |      返回所有文章      |
|      `insert()`      |      /article/add      |       插入新文章       |
|  `deleteByTitle()`   | /article/deleteByTitle |  根据文章标题删除文章  |
|  `updateViewById()`  |  /article/updateView   |       增加浏览量       |
|  `updateLikeById()`  |  /article/updateLike   |       增加评论数       |

2. User

|   方法名称   |    访问地址     |   用途   |
| :----------: | :-------------: | :------: |
|  `insert()`  |  /user/regist   | 用户注册 |
| `selectById` |   /user/login   | 用户登录 |
| `modifyPwd`  | /user/modifypwd | 修改密码 |
| `modifyImg`  | /user/modifyImg | 修改头像 |

