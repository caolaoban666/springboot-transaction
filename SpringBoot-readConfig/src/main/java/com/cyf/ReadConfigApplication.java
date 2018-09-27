package com.cyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// SpringBootHelloApplication 类需要放置在所有需要扫描包的上一级目录，默认可以扫描当前以及子包的类
@SpringBootApplication
public class ReadConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadConfigApplication.class, args);
	}
}
