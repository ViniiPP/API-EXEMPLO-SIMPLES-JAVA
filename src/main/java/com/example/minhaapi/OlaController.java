package com.example.minhaapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String dizerOla() {
        return "Olá! API rodando com DevTools";
    }

    @GetMapping("/usuarios")
    public java.util.List<Usuario> listarUsuarios() {
        return java.util.List.of(
                new Usuario(1L, "Vinicius", "vini@teste.com"),
                new Usuario(2L, "Beatriz", "bea@teste.com"),
                new Usuario(3L, "Pedro", "pedro@teste.com")
        );
    }
}
