# calculator_backend
前后端分离计算器 - SpringBoot后端
## 项目介绍
使用SpringBoot + SpringDataJPA + H2内存数据库开发计算器后端。
提供计算接口、历史记录查询接口。
部署在腾讯云Ubuntu服务器，端口8090。

## 接口
- /api/calc/compute?expr=表达式  执行计算并保存记录
- /api/calc/history 获取全部历史记录

## 技术栈
SpringBoot3.2.0, Spring Data JPA, H2 Database, Maven
