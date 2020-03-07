#用户

api前缀：http://10.4.19.31:8080/nkez/user

## 1.用户注册
url:`/user/user_registered`

data:
```$xslt
{
	"userId":"controllerTest",
	"userAccount":"controller层测试账户",
	"userPassword":"controller层测试密码",
	"userPhone":"controller层测试电话",
	"userEmail":"controller层测试邮箱",
	"userBirthday":"2019-03-06",
	"userLiuyan":"controller层测试留言"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
userId | 用户ID | 后台会自己添加一个id
userAccount | 用户账户 | 不能为空
userPassword | 用户密码 | 不能为空
userPhone | 用户电话 | 不能为空
userEmail | 用户邮箱 | 可以为空为空
userBirthday | 用户生日 | 可以为空，必须为日期格式
userLiuyan | 用户留言 | 可以为空为空
返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": null
}
```

## 2.传入用户的Id，删除指定的用户

url:`/user/user_delete`
data:
```$xslt
{
	"userId":"1551696795887341451"

}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
id | 用户主键id | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```

## 3.传入具有更新信息的用户对象 !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！

url:`、user/user_update`
data:
```$xslt
{
	"userId":"1551872977143948102",
	"userAccount":"controller层测试账户",
	"userPassword":"controller层测试密码",
	"userPhone":"controller层测试电话",
	"userEmail":"controller层测试邮箱",
	"userBirthday":"2019-03-06",
	"userLiuyan":"controller层测试留言"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
userId | 用户ID | 后台会自己添加一个id
userAccount | 用户账户 | 不能为空
userPassword | 用户密码 | 不能为空
userPhone | 用户电话 | 不能为空
userEmail | 用户邮箱 | 可以为空为空
userBirthday | 用户生日 | 可以为空，必须为日期格式
userLiuyan | 用户留言 | 可以为空为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```


## 4.查询用户分页

url:`/user/user_list`
data:
```$xslt

{
	"pageNum":1,
	"pageSize":"2"
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
pageNum | 当前页 | 不能为空
pageSize | 每页数据量 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": {
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "total": 3,
        "pages": 2,
        "list": [
            {
                "userId": "1551408235510782641",
                "userAccount": "111111",
                "userPassword": "123",
                "userEmail": "@123",
                "userPhone": "123456789",
                "userBirthday": "2019-03-01T02:43:55.000+0000",
                "userLiuyan": "hhh"
            },
            {
                "userId": "1551872977143948102",
                "userAccount": "controller层测试账户",
                "userPassword": "controller层测试密码",
                "userEmail": "controller层测试邮箱",
                "userPhone": "controller层测试电话",
                "userBirthday": "2019-03-06T00:00:00.000+0000",
                "userLiuyan": "controller层测试留言"
            }
        ],
        "prePage": 0,
        "nextPage": 2,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
            1,
            2
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 2,
        "firstPage": 1,
        "lastPage": 2
    }
}
```
## 5.模糊查询用户分页

url:`/user/user_search`
data:
```$xslt

{
	"userEmail":"2",
	"queryPage":{
		"queryPage":1,
        "pageSize":2
	}
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
userId | 用户ID | 后台会自己添加一个id
userAccount | 用户账户 | 不能为空
userPassword | 用户密码 | 不能为空
userPhone | 用户电话 | 不能为空
userEmail | 用户邮箱 | 可以为空为空
userBirthday | 用户生日 | 可以为空，必须为日期格式
userLiuyan | 用户留言 | 可以为空为空
pageNum | 当前页 | 不能为空
pageSize | 每页数据量 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": [
        {
            "userId": "1551408235510782641",
            "userAccount": "111111",
            "userPassword": "123",
            "userEmail": "@123",
            "userPhone": "123456789",
            "userBirthday": "2019-03-01T02:43:55.000+0000",
            "userLiuyan": "hhh"
        },
        {
            "userId": "2",
            "userAccount": "hulin",
            "userPassword": "123",
            "userEmail": "2",
            "userPhone": "2",
            "userBirthday": "2019-01-02T16:00:00.000+0000",
            "userLiuyan": "2"
        }
    ]
}
```
## 6.用户登录

url:`/user/user_login`
data:
```$xslt

{
	"userAccount":"hulin",
	"userPassword":""123
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:

userAccount | 用户账户 | 不能为空
userPassword | 用户密码 | 不能为空


返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": null
}
```