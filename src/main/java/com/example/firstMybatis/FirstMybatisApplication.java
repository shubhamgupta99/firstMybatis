package com.example.firstMybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Model.Users;

@MappedTypes(Users.class)
@MapperScan("Mapper")
@SpringBootApplication
public class FirstMybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstMybatisApplication.class, args);
	}
}
