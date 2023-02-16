package com.example.demo.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@OpenAPIDefinition(
        info = @Info(
                title = "Demo Spring Boot based UI RESTful web services API",
                version = "0.1-SNAPSHOT",
                description = ""
        ),

        externalDocs = @ExternalDocumentation(description = "DemoApp documentation",
                url="https://github.com/bogdan-sava/demo")
)
@RestController
@RequestMapping("/api/demo")
public class DemoController {


    @GetMapping
    public String HelloWorld (){
        return "HelloWorld";
    }
}
