package br.com.api.forumhub.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info()
                        .title("Fórum Hub API")
                        .description("API Rest da aplicação Fórum Hub!")
                        .contact(new Contact()
                                .name("Adriano Azevedo - Desenvolvedor")
                                .email("adr.azevedoo@gmail.com"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://github.com/adrianoazevedo/forum-hub/blob/main/LICENSE")));
    }
}