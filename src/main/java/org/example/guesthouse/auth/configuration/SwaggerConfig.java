package org.example.guesthouse.auth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * localhost:8080/swagger-ui/index.html/
 */
@Configuration
public class SwaggerConfig {



    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }



    private Info apiInfo(){
        return new Info()
                .title("GuestHouse api")
                .description("GuestHouse api docs입니다.")
                .version("1.0.0");
    }

//    @Bean
//    public GroupedOpenApi getUserApi(){
//        return GroupedOpenApi.builder()
//                .group("user")
//                .pathsToMatch("/api/user/**")
//                .build();
//    }


}