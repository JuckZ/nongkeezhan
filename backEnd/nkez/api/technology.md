#技术

api前缀：http://10.4.19.31:8080/nkez/technology

## 1.添加技术
url:`/technology/technology_add`

data:
```$xslt
{
	"techologyId":"controllerTest",
	"techologyTitle":"controller层测试技术标题",
	"techologyPicture":"controller层测试图片",
	"professorId":"2"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
technologyId | 技术ID | 后台会自己添加一个id
technologyTitle | 技术标题 | 不能为空
technologyPicture | 技术图片 | 可以为空
professorId | 技术来源 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": null
}
```

## 2.传入技术的Id，删除指定的技术

url:`/technology/technology_delete`
data:
```$xslt
{
	"technologyId":"1551696795887341451"

}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
id | 技术主键id | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```

## 3.传入具有更新信息的技术对象 !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！

url:`/technology/technology_update`
data:
```$xslt
{
	"techologyId":"controllerTest",
	"techologyTitle":"controller层测试技术标题",
	"techologyPicture":"controller层测试图片",
	"professorId":"2"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
technologyId | 技术ID | 后台会自己添加一个id
technologyTitle | 技术标题 | 不能为空
technologyBody | 技术体 | 不能为空
technologyPicture | 技术图片 | 可以为空
technologySource | 技术来源 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```


## 4.查询技术分页

url:`/technology/technology_list`
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
        "total": 6,
        "pages": 3,
        "list": [
            {
                "techologyId": "1",
                "professorId": "2",
                "techologyTitle": "更新",
                "techologyPicture": "11"
            },
            {
                "techologyId": "1551850819397376513",
                "professorId": "2",
                "techologyTitle": "controller层测试技术标题",
                "techologyPicture": "controller层测试图片"
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
            2,
            3
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 3,
        "lastPage": 3,
        "firstPage": 1
    }
}
```
## 5.模糊查询技术分页

url:`/technology/technology_search`
data:
```$xslt

{
	"techologyTitle":"基于",
	"queryPage":{
		"queryPage":1,
        "pageSize":2
	}
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
technologyTitle | 按照技术模糊查询 | 可以为空
pageNum | 当前页 | 不能为空
pageSize | 每页数据量 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": [
        {
            "techologyId": "2",
            "professorId": "19",
            "techologyTitle": "基于springboot的网站后台开发",
            "techologyPicture": "22"
        },
        {
            "techologyId": "3",
            "professorId": "3",
            "techologyTitle": "基于JSP的网站后台开发",
            "techologyPicture": "33"
        }
    ]
}
```