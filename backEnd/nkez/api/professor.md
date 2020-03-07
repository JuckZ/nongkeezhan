#专家

api前缀：http://10.4.19.31:8080/nkez/professor

## 1.添加专家
url:`/professor_add`

data:
```$xslt
{
	"professorId":"controllerTest",
	"professorName":"hulin",
	"professorPosition":"教师",
	"professorYjfx":"java",
	"professorZl":"controller层测试专家资料",
	"professorPicture":"controller层测试专家图片",
	"professorCategory":"controller层测试专家类别"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
professorId | 专家ID | 后台会自己添加一个id
professorName | 专家姓名 | 不能为空
professorPosition | 专家职称 | 不能为空
professorPicture | 专家图片 | 可以为空
professorZl | 专家资料 | 不能为空
professorCategory | 专家类别 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": null
}
```

## 2.传入专家的Id，删除指定的专家

url:`/professor/professor_delete`
data:
```$xslt
{
	"professorId":"1551846167187385745"

}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
id | 专家主键id | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```

## 3.传入具有更新信息的专家对象 !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！

url:`、professor/professor_update`
data:
```$xslt
{
	"professorId":"1551846374268514508",
	"professorName":"juck",
	"professorPosition":"教师",
	"professorYjfx":"java",
	"professorZl":"controller层测试专家资料",
	"professorPicture":"controller层测试专家图片",
	"professorCategory":"controller层测试专家类别"
}
```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
professorId | 专家ID | 后台会自己添加一个id
professorName | 专家姓名 | 不能为空
professorPosition | 专家职称 | 不能为空
professorPicture | 专家图片 | 可以为空
professorZl | 专家资料 | 不能为空
professorCategory | 专家类别 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "object": null
}
```


## 4.查询专家分页

url:`/professor/professor_list`
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
        "total": 25,
        "pages": 13,
        "list": [
            {
                "professorId": "1",
                "professorName": "马均",
                "professorPosition": "教授",
                "professorYjfx": "观赏植物培育与应用研究、观赏植物叶片嵌合性状形成机理研究",
                "professorZl": "学习经历：\r\n\r\n1、2014.10-2015.10以色列农业研究组织博士后\r\n\r\n2、2008.09-2012.07华南农业大学博士\r\n\r\n3、2003.09-2006.07四川农业大学硕士\r\n\r\n4、1995.09-1999.07中南林学院本科\r\n\r\n工作经历：\r\n\r\n1、2016.01-至今四川农业大学教授\r\n\r\n2、2010.01-2015.12四川农业大学副教授\r\n\r\n3、2005.01-2010.01四川农业大学讲师\r\n\r\n4、1999.07-2004.12四川农业大学助教\r\n\r\n教学科研业绩：\r\n\r\n先后主持国家自然科学基金项目3项，省级重点项目1项；主研结题国家、省部级项目8项。现己在国内外发表学术论文30余篇，其中以SCI收录论文7篇，最高影响因子5.3。获得四川省科技进步一等奖1项，参与选育新品种2个，获得实用新型专利13项。\r\n\r\n一、主持项目：\r\n\r\n1、国家自然科学基金面上项目，多组学解析红苞凤梨嵌合性状形成机理研究。\r\n\r\n2、国家自然科学基金面上项目，红苞凤梨金边嵌合性状非编码RNA表观调控机制。\r\n\r\n3、国家自然科学基金青年项目，红苞凤梨嵌合体中白化细胞失绿分子机理研究\r\n\r\n4、四川省教育厅重点项目，曼地亚红豆杉水分、光照、温度胁迫生理响应研究(2008－2011)。\r\n\r\n二、代表论文：\r\n\r\n1、XLi, S. Kanakala,Y.H. He, X.L. Zhong, S.M. Yu, R.X. Li, L.X. Sun, J. Ma *. PhysiologicalCharacterization and Comparative Transcriptome Analysis of White and GreenLeaves of Ananascomosus var. bracteatus.Plos One, 2017, IF=3.057\r\n\r\n2、J. Ma, S.Kanakala, Y.H. He, J.L. Zhang, X.L. Zhong.Transcriptome sequence analysis of anornamental plant, Ananascomosus var. bracteatus, revealed the potentialunigenes involved in terpenoid and phenylpropanoid biosynthesis. Plos One,2015, IF=3.53\r\n\r\n3、J. Ma, Y.H. He,C.H. Wu, H.P. Liu, Z.Y. Hu, G.M. Sun. Cloning and molecular characterization ofa SERK gene transcriptionally induced during somatic embryogenesis inAnanascomosus. cv. Shenwan. Plant MolBiol Rep. 2012, IF=5.3\r\n\r\n4、J. Ma, R. Aloni,A. Villordon, D. Labonte, Y. Kfir, H. Zemach, A. Schwartz, L. Althan, N. Firon.Adventitious root primordia formation and development in stem nodes of ‘GeorgiaJet’ sweetpotato, Ipomoea batatas. American Journal of Botany, 2015, IF=2.463\r\n\r\n5、J. Ma, Y.H.He,Z.Y. Hu, W.T. Xu, J.X. Xia, C.H. Guo, S.Q. Lin, L. Cao, C.J. Chen, C.H. Wu,J.L. Zhang. Characterization and expression analysis of AcSERK2, a somaticembryogenesis and stress resistance related gene in pineapple. Gene, 2012,IF=2.1\r\n\r\n6、J. Ma, Y.H. He,Z.Y. Hu, W.T. Xu, J.X. Xia, C.H. Guo, S.Q. Lin,C.J. Chen, C.H. Wu, J.L. Zhang.Characterization of the third SERK gene in pineapple (Ananascomosus) andanalysis of its expression and autophosphorylation activity in vitro.GenetMolBiol，2014，IF=1.2",
                "professorPicture": "",
                "professorCategory": "植物保护"
            },
            {
                "professorId": "10",
                "professorName": "李平",
                "professorPosition": "教授",
                "professorYjfx": "水稻研究\r\n\r\n",
                "professorZl": "四川农业大学水稻研究所所长，国家百千万人才第一、二层次人选，四川省学术与技术带头人，四川省作物学会副理事长及四川省细胞生物学会、省遗传学会理事和中国农业生物技术学会作物分会理事等。先后获得四川省科技进步奖一等奖4项、国家科技进步二等奖 2 项，并被四川省委省政府授予首届“优秀创业人才”和被国家科技部授予“国家 863 计划十五周年先进个人”称号。",
                "professorCategory": "作物育种与栽培"
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
            3,
            4,
            5,
            6,
            7,
            8
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 8,
        "firstPage": 1,
        "lastPage": 8
    }
}
```
## 5.模糊查询专家分页

url:`/professor/professor_search`
data:
```$xslt

{
	"professorName":"李",
	"queryPage":{
		"queryPage":1,
        "pageSize":2
	}
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:
professorName | 专家姓名 | 可以为空
professorPosition | 专家职称 | 可以为空
professorPicture | 专家图片 | 可以为空
professorZl | 专家资料 | 可以为空
professorCategory | 专家类别 | 可以为空
pageNum | 当前页 | 不能为空
pageSize | 每页数据量 | 不能为空

返回值示例：
```
{
    "code": 0,
    "message": "操作成功",
    "data": [
        {
            "professorId": "10",
            "professorName": "李平",
            "professorPosition": "教授",
            "professorYjfx": "水稻研究\r\n\r\n",
            "professorZl": "四川农业大学水稻研究所所长，国家百千万人才第一、二层次人选，四川省学术与技术带头人，四川省作物学会副理事长及四川省细胞生物学会、省遗传学会理事和中国农业生物技术学会作物分会理事等。先后获得四川省科技进步奖一等奖4项、国家科技进步二等奖 2 项，并被四川省委省政府授予首届“优秀创业人才”和被国家科技部授予“国家 863 计划十五周年先进个人”称号。",
            "professorCategory": "作物育种与栽培"
        },
        {
            "professorId": "11",
            "professorName": "李仕贵",
            "professorPosition": "教授",
            "professorYjfx": "水稻遗传育种及应用基础研究",
            "professorZl": "在水稻骨干亲本和品种选育，以及重要农艺性状QTL挖掘方面取得了显著的成绩。育成蜀恢527，蜀恢498等一系列杂交稻骨干亲本，选育杂交稻新品种50余个，其中超级稻6个。获国家杰出青年基金主持，教育部新世纪优秀人才支持计划，全国劳模，全国优秀农业科技工作者等荣誉称号。获国家科技进步二等奖3项（主持1项），四川省科技进步一等奖3项（主持2项），四川省级二等奖2项，省部级三等奖5项。发表论文70余篇",
            "professorCategory": "作物育种与栽培"
        }
    ]
}
```
## 6.按专家类别来获取专家列表

url:`/professor/get_professor_by_category`
data:
```$xslt

{
	"professorCategory":"植物保护",
	"queryPage":{
		"queryPage":1,
        "pageSize":2
	}
}

```
字段说明：

字段名 | 描述 | 备注
:-----: | :-------: | :-------:

professorCategory | 专家类别 | 不能为空
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
        "total": 5,
        "pages": 3,
        "list": [
            {
                "professorId": "1",
                "professorName": "马均",
                "professorPosition": "教授",
                "professorYjfx": "观赏植物培育与应用研究、观赏植物叶片嵌合性状形成机理研究",
                "professorZl": "学习经历：\r\n\r\n1、2014.10-2015.10以色列农业研究组织博士后\r\n\r\n2、2008.09-2012.07华南农业大学博士\r\n\r\n3、2003.09-2006.07四川农业大学硕士\r\n\r\n4、1995.09-1999.07中南林学院本科\r\n\r\n工作经历：\r\n\r\n1、2016.01-至今四川农业大学教授\r\n\r\n2、2010.01-2015.12四川农业大学副教授\r\n\r\n3、2005.01-2010.01四川农业大学讲师\r\n\r\n4、1999.07-2004.12四川农业大学助教\r\n\r\n教学科研业绩：\r\n\r\n先后主持国家自然科学基金项目3项，省级重点项目1项；主研结题国家、省部级项目8项。现己在国内外发表学术论文30余篇，其中以SCI收录论文7篇，最高影响因子5.3。获得四川省科技进步一等奖1项，参与选育新品种2个，获得实用新型专利13项。\r\n\r\n一、主持项目：\r\n\r\n1、国家自然科学基金面上项目，多组学解析红苞凤梨嵌合性状形成机理研究。\r\n\r\n2、国家自然科学基金面上项目，红苞凤梨金边嵌合性状非编码RNA表观调控机制。\r\n\r\n3、国家自然科学基金青年项目，红苞凤梨嵌合体中白化细胞失绿分子机理研究\r\n\r\n4、四川省教育厅重点项目，曼地亚红豆杉水分、光照、温度胁迫生理响应研究(2008－2011)。\r\n\r\n二、代表论文：\r\n\r\n1、XLi, S. Kanakala,Y.H. He, X.L. Zhong, S.M. Yu, R.X. Li, L.X. Sun, J. Ma *. PhysiologicalCharacterization and Comparative Transcriptome Analysis of White and GreenLeaves of Ananascomosus var. bracteatus.Plos One, 2017, IF=3.057\r\n\r\n2、J. Ma, S.Kanakala, Y.H. He, J.L. Zhang, X.L. Zhong.Transcriptome sequence analysis of anornamental plant, Ananascomosus var. bracteatus, revealed the potentialunigenes involved in terpenoid and phenylpropanoid biosynthesis. Plos One,2015, IF=3.53\r\n\r\n3、J. Ma, Y.H. He,C.H. Wu, H.P. Liu, Z.Y. Hu, G.M. Sun. Cloning and molecular characterization ofa SERK gene transcriptionally induced during somatic embryogenesis inAnanascomosus. cv. Shenwan. Plant MolBiol Rep. 2012, IF=5.3\r\n\r\n4、J. Ma, R. Aloni,A. Villordon, D. Labonte, Y. Kfir, H. Zemach, A. Schwartz, L. Althan, N. Firon.Adventitious root primordia formation and development in stem nodes of ‘GeorgiaJet’ sweetpotato, Ipomoea batatas. American Journal of Botany, 2015, IF=2.463\r\n\r\n5、J. Ma, Y.H.He,Z.Y. Hu, W.T. Xu, J.X. Xia, C.H. Guo, S.Q. Lin, L. Cao, C.J. Chen, C.H. Wu,J.L. Zhang. Characterization and expression analysis of AcSERK2, a somaticembryogenesis and stress resistance related gene in pineapple. Gene, 2012,IF=2.1\r\n\r\n6、J. Ma, Y.H. He,Z.Y. Hu, W.T. Xu, J.X. Xia, C.H. Guo, S.Q. Lin,C.J. Chen, C.H. Wu, J.L. Zhang.Characterization of the third SERK gene in pineapple (Ananascomosus) andanalysis of its expression and autophosphorylation activity in vitro.GenetMolBiol，2014，IF=1.2",
                "professorPicture": "",
                "professorCategory": "植物保护"
            },
            {
                "professorId": "18",
                "professorName": "李西",
                "professorPosition": "教授",
                "professorYjfx": " 生态修复、园林植物资源及植物景观设计",
                "professorZl": "学习经历：\r\n\r\n1、1994.09-1996.07  四川农业大学城市园林设计与花卉专业学习；\r\n\r\n2、1998.09-2001.07  四川农业大学草业科学专业硕士研究生，获农学硕士学位；\r\n\r\n3、2001.09-2004.07  四川农业大学森林培育专业博士研究生，获农学博士学位；\r\n\r\n4、2008.07-2010.05  美国密苏里大学和美国草坪学工业界作访问学者。\r\n\r\n工作经历：\r\n\r\n1、1996.07-1998.08 成都市大汉园景成都分公司设计部助理景观设计师；\r\n\r\n2、2004.07-2006.11 四川农业大学资源环境系，讲师；\r\n\r\n3、2006.12-2010.07 四川农业大学旅游学院，副教授；\r\n\r\n4、2010.08-2016.01 四川农业大学风景园林学院，副教授，系主任；\r\n\r\n5、2016.01-现在  四川农业大学风景园林学院，教授；\r\n\r\n教学科研业绩：\r\n\r\n校级优秀本科、硕士学位论文指导教师；先后主持省部级科研课题及重大校企合作项目9项，组织参与大中型城市生态公园、城市滨河景观、高速公路植被恢复、城市绿道系统规划等设计项目30余项，国内外公开发表论文50余篇，国家发明专利5项。",
                "professorCategory": "植物保护"
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