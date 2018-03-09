package com.myfour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.myfour.util.MyMapper;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages="com.myfour.dao",markerInterface=MyMapper.class)
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}
}
