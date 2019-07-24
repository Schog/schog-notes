# 代码生成器设计概要  
## 设计概要  
    generator  
    ├──代码生成器  
    |    ├──后端代码生成  
    |    ├──前端代码生成  
    |    ├──移动端代码生成  
    |    |    ├──安卓代码生成  
    |    |    ├──ios代码生成  
    ├──文档生成器  
    |    ├──接口文档生成  
    |    |    ├──swagger2文档  
    |    |    ├──word文档  
    |    |    ├──excel文档  
    |    |    ├──json文档  
    |    |    |    ├──postman导入  
    |    |    |    ├──yapi导入  
    |    |    ├──markdown文档 
    |    ├──数据库文档生成  
    |    |    ├──word文档  
    |    |    ├──excel文档  
    |    |    ├──markdown文档    

## 技术难点  
    技术难点  
    ├──数据源选择  
    |    ├──mysql  
    |    ├──orcale  
    ├──数据库规范
    ├──表关系  
    |    ├──一对一  
    |    ├──一对多  
    |    ├──多对多  
    ├──模板  
    |    ├──模板引擎
    |    |    ├──Apache FreeMarker
    |    |    ├──velocity
    |    |    ├──thymeleaf
    |    ├──模板选择
    |    |    ├──后端模板  
    |    |    ├──前端模板  
    |    |    ├──移动端模板  
    ├──模板变更  
## 已有项目参考   
待参考项目开源协议必须为MIT、WTFPL或者其他宽松的协议  
* (MIT)(web)[kitty-generator](https://gitee.com/liuge1988/kitty-generator)
* (MIT)[HY-generator](https://gitee.com/luanhaoyu/crud-generator)

## 程序设计
    TODO