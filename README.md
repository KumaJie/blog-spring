# Easy Blog

## 1. 实体类

- User
- Article

## 2. 接口

1. Article

|       方法名称       |        访问地址        |          用途          |
| :------------------: | :--------------------: | :--------------------: |
|  `selectByTitle()`   |  /article/findByTitle  |  根据文章标题获取文章  |
| `selectListByUserId` |   /article/findById    | 返回该id用户的所有文章 |
| `selectListByViews`  |  /article/findByViews  | 根据浏览量返回所有文章 |
|    `selectList()`    |   /article/findList    |      返回所有文章      |
|      `insert()`      |      /article/add      |       插入新文章       |
|  `deleteByTitle()`   | /article/deleteByTitle |  根据文章标题删除文章  |
|  `updateViewById()`  |  /article/updateView   |       增加浏览量       |
|  `updateLikeById()`  |  /article/updateLike   |       增加评论数       |

2. User

|   方法名称   |   访问地址   |   用途   |
| :----------: | :----------: | :------: |
|  `insert()`  | /user/regist | 用户注册 |
| `selectById` | /user/login  | 用户登录 |
|              |              |          |

