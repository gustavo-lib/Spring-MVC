# Spring-Maven-Simple-Project
Poejecto Simple en maven con eclipse, creando contenedor de beans en xml 
## Requisitos
- Java 8 
- Maven 3.0
- Eclipse 

## Dependencias del proyecto Maven
- spring-core 5.3.8
- spring-context 5.3.8

## pom.xml
```
<project xmlns="http://maven.apache.org/POM/4.0.0" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>gortiz.spring-maven</groupId>
  <artifactId>spring-maven</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>Simple Project Maven</name>
  <dependencies>
  	<dependency>
  		<groupId>org.springframework</groupId>
  		<artifactId>spring-core</artifactId>
  		<version>5.3.8</version>
  	</dependency>
  	<dependency>
  		<groupId>org.springframework</groupId>
  		<artifactId>spring-context</artifactId>
  		<version>5.3.8</version>
  	</dependency>
  	<dependency>
  		<groupId>org.junit.jupiter</groupId>
  		<artifactId>junit-jupiter</artifactId>
  		<version>5.7.1</version>
  	</dependency>
  </dependencies>
</project>

```
## applicationContext.xml
```
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
	xmlns:aop="http://www.springframework.org/schema/aop" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:jee="http://www.springframework.org/schema/jee" xmlns:tx="http://www.springframework.org/schema/tx"
	xmlns:task="http://www.springframework.org/schema/task"
	xsi:schemaLocation="http://www.springframework.org/schema/aop 
  http://www.springframework.org/schema/aop/spring-aop-3.2.xsd http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd       http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd 
  http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-3.2.xsd http://www.springframework.org/schema/tx                                 http://www.springframework.org/schema/tx/spring-tx-3.2.xsd 
  http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.2.xsd">
 
	<context:component-scan base-package="com.gortiz" />
	<bean id="helloWorldService"
		class="com.gortiz.HelloWorldService">
	</bean>
</beans>

```
![1](https://user-images.githubusercontent.com/54692898/127573833-c831c2d8-f9ff-41b8-8da6-8b872e4d1b30.jpg)

![2](https://user-images.githubusercontent.com/54692898/127574360-4343ff14-0b67-4d98-b8b9-b41290e24944.jpg)
