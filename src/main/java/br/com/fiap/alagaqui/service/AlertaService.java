package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.Alerta;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository repository;

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }

    public List<Alerta> listarTodos() {
        return repository.findAll();
    }

    public Alerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Alerta com ID " + id + " não encontrado."));
    }

    public Alerta atualizar(Long id, Alerta alertaAtualizado) {
        Alerta existente = buscarPorId(id);

        existente.setTipoAlerta(alertaAtualizado.getTipoAlerta());
        existente.setMensagem(alertaAtualizado.getMensagem());
        existente.setDataHoraCriacao(alertaAtualizado.getDataHoraCriacao());
        existente.setResolvido(alertaAtualizado.getResolvido());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Alerta com ID " + id + " não encontrado para exclusão.");
        }
        repository.deleteById(id);
    }
}
