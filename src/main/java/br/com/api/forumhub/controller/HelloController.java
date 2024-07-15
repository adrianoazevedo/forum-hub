package br.com.api.forumhub.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Tag(name = "Hello")
public class HelloController {

    @GetMapping
    @Operation(summary = "Ola!", description = "Serve como como um aviso que um end point público para verificar se a API está em execução.")
    public String olaMundo(){
        return "OLA ADR";
    }

}
