package com.example.minhaapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios") // todas as rotas aq vão começar com /usuarios
public class UsuarioController {

    // tabela temporaria
    private List<Usuario> usuarios = new ArrayList<>();

    // metodo get para listar
    @GetMapping
    public List<Usuario> listar() {
        return usuarios;
    }

    // metodo post para novos usuarios
    @PostMapping
    public String adicionar(@RequestBody Usuario novoUsuario) {
        usuarios.add(novoUsuario);
        return "usuario " + novoUsuario.nome() + " cadastrado com sucesso!";
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

}
