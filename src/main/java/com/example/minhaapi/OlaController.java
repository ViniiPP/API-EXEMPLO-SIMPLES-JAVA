package com.example.minhaapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String dizerOla() {
        return "Olá! API rodando com DevTools";
    }
}
