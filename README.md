# Easy Blog

## 1. 实体类

- User
- Article

## 2. 接口

1. Article

|       方法名称       |        访问地址        |        请求方式        |          用途          |
| :------------------: | :--------------------: | :--------------------: | :--------------------: |
|  `selectById()`   |  /article/findById  |  `GET`  |  根据文章ID获取文章  |
| `selectListByUserId` |   /article/findListById    |   `GET`   | 返回该id用户的所有文章 |
| `selectListByView` |  /article/findListByView  |  `GET`  | 根据浏览量返回所有文章 |
|    `selectList()`    |   /article/findList    |       |      返回所有文章      |
|      `insert()`      |      /article/add      |      `POST`      |       插入新文章       |
|  `deleteById()` | /article/deleteById | `GET` |  根据文章ID删除文章  |
|  `updateViewById()`  |  /article/updateView   | `GET` |       增加浏览量       |
|  `updateLikeById()`  |  /article/updateLike   | `GET` |       增加喜欢       |
| `modifyContent` | /article/modifyContent | `POST` | 修改内容 |

2. User

|   方法名称   |    访问地址     | 请求方式 |   用途   |
| :----------: | :-------------: | :------: | :------: |
|  `insert()`  |  /user/regist   |  `POST`  | 用户注册 |
| `selectById` |   /user/login   |  `POST`  | 用户登录 |
| `modifyPwd`  | /user/modifypwd |          | 修改密码 |
| `modifyImg`  | /user/modifyImg |          | 修改头像 |

3. Comment

|         方法名称          |           访问地址           | 请求方式 |             用途             |
| :-----------------------: | :--------------------------: | :------: | :--------------------------: |
|        `insert()`         |         /comment/add         |  `POST`  | 根据用户id以及文章id添加评论 |
| `selectListByArticleId()` | /comment/findListByArticleId |  `GET`   |      返回对应文章的评论      |
|      `modifyLike()`       |       /comment/addLike       |  `GET`   |             点赞             |

