package com.kgc.edocwork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kgc.edocwork.mapper")
@SpringBootApplication
public class EdocworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdocworkApplication.class, args);
	}

}
