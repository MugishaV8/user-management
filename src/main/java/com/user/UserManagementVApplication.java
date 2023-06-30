package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User Management API", version = "v1", description = "User Management by Vedaste"))
public class UserManagementVApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementVApplication.class, args);
	}

}
