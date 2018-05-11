package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  整合Swagger 方便restful 测试 
 */
@EnableSwagger2 // 开启swagger2 的功能
@SpringBootApplication
public class SpringbootSsmDemoApplication {

    // 将应用打包成一个镜像发布在远程的docker容器中
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmDemoApplication.class, args);
	}
}
