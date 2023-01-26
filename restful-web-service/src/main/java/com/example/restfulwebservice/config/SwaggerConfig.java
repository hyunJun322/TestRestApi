package com.example.restfulwebservice.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@OpenAPIDefinition(
		info = @Info(title ="swagger 테스트 명세서",
				description = "REST API 테스트",
				version = "V1"))
@Configuration
public class SwaggerConfig {


    @Bean
    public GroupedOpenApi chatOpenApi() {
        String[] paths = {"/v1/**"};
 
        return GroupedOpenApi.builder()
                .group("채팅서비스 API v1")
                .pathsToMatch(paths)
                .build();
    }
	
}
