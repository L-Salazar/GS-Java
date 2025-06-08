package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.dto.UsuarioDTO;
import br.com.fiap.alagaqui.entity.Usuario;
import br.com.fiap.alagaqui.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<UsuarioDTO> login(@RequestBody Usuario loginRequest) {
        try {
            Usuario usuario = usuarioService.verificarCredenciais(loginRequest.getEmail(), loginRequest.getSenha());

            UsuarioDTO usuarioDTO = new UsuarioDTO(
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getEmail()
            );

            return ResponseEntity.ok(usuarioDTO);
        } catch (Exception e) {
            return ResponseEntity.status(401).body(
                    new UsuarioDTO(null, "Login falhou", "Credenciais inválidas")
            );
        }
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
md
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UsuarioDTO> atualizarParcialmente(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO) {
        try {
            Usuario usuarioExistente = usuarioService.buscarPorId(id);

            if (usuarioDTO.getNome() != null) {
                usuarioExistente.setNome(usuarioDTO.getNome());
            }
            if (usuarioDTO.getEmail() != null) {
                usuarioExistente.setEmail(usuarioDTO.getEmail());
            }

            Usuario atualizado = usuarioService.salvar(usuarioExistente);

            return ResponseEntity.ok(new UsuarioDTO(
                    atualizado.getId(),
                    atualizado.getNome(),
                    atualizado.getEmail()
            ));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
