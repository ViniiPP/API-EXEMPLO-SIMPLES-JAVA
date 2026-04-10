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

    // buscar por ID
    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // Alterar usuario
    @PutMapping("/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        for (int i = 0; i <usuarios.size(); i++) {
            if (usuarios.get(i).id().equals(id)) {
                usuarios.set(i, usuarioAtualizado); // Substitui o antigo pelo novo
                return "Usuario atualizado com sucesso!";
            }
        }
        return  "Usuario não encontrado";
    }

    // deletar usuario
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        // remova se o ID for igual ao ID passado
        boolean deletado = usuarios.removeIf(usuario -> usuario.id().equals(id));

        if (deletado) {
            return "Usuario deletado com sucesso!";
        } else {
            return "Usuario não encontrado";
        }

    }

}
