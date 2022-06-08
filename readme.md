## **capricorn_a**

最简单的gradle 构建的springboot项目

1.设置maven仓库下载地址以及gradle插件
~~~~
buildscript {
    repositories {
        maven { url "http://maven.aliyun.com/nexus/content/groups/public/" }
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.5.2.RELEASE")
    }
}
~~~~

2.引入必须的依赖
~~~~
implementation 'org.springframework.boot:spring-boot-starter:1.5.2.RELEASE'
implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.2'
implementation 'mysql:mysql-connector-java:8.0.21'
implementation 'org.springframework.boot:spring-boot-starter-web'
~~~~
3.标明启动类以及配置文件
~~~~
bootRun{
    main="com.lingyi.biz.server.CapricornStartServer"
    jvmArgs = [
            "-Dspring.config.location=classpath:application.properties"
    ]
}
~~~~

4.启动类添加注解
~~~~
@SpringBootApplication
@ComponentScan(basePackages = "com.lingyi")//配置扫包路径
@MapperScan(basePackages = "com.lingyi.biz.integration.dao")//mapper.xml路径
public class CapricornStartServer {
    public static void main(String[] args) {
        SpringApplication.run(CapricornStartServer.class);
        System.out.println("==Server start now==");
    }
}
~~~~
5.dao层下的与mapper对应的接口如果同名，则不需要配置

6.应用端口号，server.content-path，mybatis连接配置
~~~~
server.port=1580
#在spring高版本中可能要设置成 server.servlet.context-path=/capricorn
server.context-path=/capricorn

#mybatis
mybatis.mapper-locations= classpath:mapper/*.xml
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/capricorn?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useAffectedRows=true&serverTimezone=UTC
spring.datasource.password=123
spring.datasource.username=root
~~~~

7.创建controller，试运行接口