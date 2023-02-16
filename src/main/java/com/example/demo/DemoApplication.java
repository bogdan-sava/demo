package com.example.demo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Demo Spring Boot based UI RESTful web services API",
				version = "0.1-SNAPSHOT",
				description = ""
		),

		externalDocs = @ExternalDocumentation(description = "DemoApp documentation",
				url="https://github.com/bogdan-sava/demo")
)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
