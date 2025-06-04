package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.Usuario;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário com ID " + id + " não encontrado."));
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario existente = buscarPorId(id);

        existente.setNome(usuarioAtualizado.getNome());
        existente.setEmail(usuarioAtualizado.getEmail());
        existente.setSenha(usuarioAtualizado.getSenha());
        existente.setDataUltimaCriacaoRelato(usuarioAtualizado.getDataUltimaCriacaoRelato());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Usuário com ID " + id + " não encontrado para exclusão.");
        }
        repository.deleteById(id);
    }
}
