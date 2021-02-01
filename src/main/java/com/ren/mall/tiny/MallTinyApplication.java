package com.ren.mall.tiny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.ren.mall.tiny.dao")
public class MallTinyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallTinyApplication.class, args);
	}

}
