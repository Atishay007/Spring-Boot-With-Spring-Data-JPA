package com.atishay.springbootstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * Starting Point of the Spring Boot Application.
 */

@SpringBootApplication
// To enable JPA Repository, however it will work if you didn't declare these
// annotations, reason: Becoz this class is on top of other classes and it will
// automatically scan the base classes and packages.
@EnableJpaRepositories(basePackages = { "com.atishay.springbootstarter.repository" })
@EntityScan(basePackages = { "com.atishay.springbootstarter.entity" })
//@PropertySource("check.properties")
public class CourseApiAppMain {

	//@Value("${check.properties}")
	//static String dataSource;

	public static void main(String[] args) {
		SpringApplication.run(CourseApiAppMain.class, args);
		//System.out.println("***************" + dataSource);
	}
}
