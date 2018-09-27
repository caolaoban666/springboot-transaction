# 构建过程
- 参考链接：http://www.ityouknow.com/springboot/2016/01/06/spring-boot-quick-start.html

- https://start.spring.io   Search for dependencies 添加 web 模块
- 点击 Generate Project 生成项目
- IDEA File - Open -- 选择项目地址导入
- pom.xml 中配置
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
- 在启动类(SpringBootHelloApplication)的当前路径下建包 controller / service / repository ....
- 创建 Controller    HelloController.java 
- 启动 SpringBootHelloApplication main 方法
- 访问 http://localhost:8080/hello
    
    Hello SpringBoot!
