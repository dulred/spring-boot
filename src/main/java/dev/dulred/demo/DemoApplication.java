package dev.dulred.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("dev.dulred.demo.mapper")
@ServletComponentScan("dev.dulred.demo.controller")
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
