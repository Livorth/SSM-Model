# SSM-Model
在ssm框架学习的末尾，进行一个ssm框架的整合，以后如果需要使用ssm框架的时候可以直接使用这个模型进行构建

## 项目运行结果
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210326191954951.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0FsaXZvcnRo,size_16,color_FFFFFF,t_70)
## 配置步骤
### 准备工作
1. 首先创建数据库，提供测试的数据
2. 创建项目并导包
###  Mybatis部署
1. 连接数据库
2. 编写实体类
3. 编写Dao层接口与对应的**Mapper.xml**
4. 编写Mybatis的配置文件**Mybatis-Config.xml**
5. 编写Spring连接Dao层的配置文件：**Spring-Dao.xml**

### Spring部署
1. 编写Service层接口和实现类
2. 编写Spring连接Service层的配置文件：**Spring-Service.xml**
3. 编写一个测试类**TestDao.java**

### SpringMVC部署
1.  配置**web.xml**
2.  配置SpringMVC的配置文件：**Spring-mvc.xml**
3.  配置Spring总和配置文件：**applicationContext.xml**

### Controller层与交互页面编写
1. 编写**BookController.java**，实现相关功能
2. 编写前段页面：那些jsp的
