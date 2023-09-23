# SQL and Java Core  ATM Project
## Git Link [Github Link](https://github.com/hamitmizrak/Sql-Java-Core-Maven)
---
## `Project Properties`
- **Java20**
- *Maven*
  <br/>
---

## Maven Dependency
> SQL
> Lombok
> Servlet
---
### Maven Libraries
```sh
<?xml version="1.0" encoding="UTF-8"?>  
<project xmlns="http://maven.apache.org/POM/4.0.0"  
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">  
 <modelVersion>4.0.0</modelVersion>  
  
 <groupId>com.hamitmizrak</groupId>  
 <artifactId>Sql_JavaCore</artifactId>  
 <version>1.0-SNAPSHOT</version>  
 <name>JavaFullStackDeveloper_11</name>  
 <description>Java Core SQL Native</description>  
  <!--<packaging>JAR</packaging>-->  <!--for Spring Boot Dockerize-->  
 <!--<packaging>WAR</packaging>--> <!--manuel deployment Apache Tomcat-->  
 <!--PROPERTIES-->  <properties>  
 <encoding>UTF-8</encoding>  
 <java.version>20</java.version>  
  
  <!--for maven-->  
  <maven.compiler.source>20</maven.compiler.source>  
 <maven.compiler.target>20</maven.compiler.target>  
 <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>  
  <!--my special version numbers , other technology-->  
  <mysql.version>8.0.28</mysql.version>  
 <lombok.version>1.18.20.0</lombok.version>  
 <javax.servlet.version>4.0.1</javax.servlet.version>  
 </properties>  
  <!--DEPENDENCIES-->  
  <dependencies>  
  
  <!--Apache Tomcat for apache Tomcat-->  
  <dependency>  
 <groupId>javax.servlet</groupId>  
 <artifactId>javax.servlet-api</artifactId>  
 <version>${javax.servlet.version}</version>  
 <scope>provided</scope>  
 </dependency>  
  <!--lombok-->  
 <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok-maven-plugin -->  <dependency>  
 <groupId>org.projectlombok</groupId>  
 <artifactId>lombok-maven-plugin</artifactId>  
 <version>${lombok.version}</version>  
 <scope>provided</scope>  
 </dependency>  
  
  <!--Mysql-->  
 <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->  <dependency>  
 <groupId>mysql</groupId>  
 <artifactId>mysql-connector-java</artifactId>  
 <version>${mysql.version}</version>  
 </dependency> </dependencies>  
 <build>  <!--manuel apache tomcat-->  
  <defaultGoal>spring-boot:run</defaultGoal>  
 <finalName>${project.artifactId}</finalName>  
 <plugins>  <!-- for maven -->  
 <!--<plugin> <groupId>org.apache.maven.plugins</groupId> <artifactId>maven-resources-plugin</artifactId> <version>3.3.1</version> </plugin> --> <!-- for maven target 17 --> <!--<plugin> <groupId>org.apache.maven.plugins</groupId> <artifactId>maven-compiler-plugin</artifactId> <version>3.8.1</version> <configuration> <source>17</source> <target>17</target> </configuration> </plugin>-->  
  <plugin>  
 <groupId>org.springframework.boot</groupId>  
 <artifactId>spring-boot-maven-plugin</artifactId>  
 <configuration> <excludes> <exclude> <groupId>org.projectlombok</groupId>  
 <artifactId>lombok</artifactId>  
 </exclude> </excludes> </configuration> </plugin> </plugins> </build> <!--end build -->  
</project>
```


