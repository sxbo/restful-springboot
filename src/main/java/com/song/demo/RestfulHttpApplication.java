package com.song.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.song.demo.dao")
public class RestfulHttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulHttpApplication.class, args);
	}
}
