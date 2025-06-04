package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.TipoAlerta;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.TipoAlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAlertaService {

    @Autowired
    private TipoAlertaRepository repository;

    public TipoAlerta salvar(TipoAlerta tipoAlerta) {
        return repository.save(tipoAlerta);
    }

    public List<TipoAlerta> listarTodos() {
        return repository.findAll();
    }

    public TipoAlerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TipoAlerta com ID " + id + " não encontrado."));
    }

    public TipoAlerta atualizar(Long id, TipoAlerta tipoAlertaAtualizado) {
        TipoAlerta existente = buscarPorId(id);

        existente.setDescricao(tipoAlertaAtualizado.getDescricao());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("TipoAlerta com ID " + id + " não encontrado para exclusão.");
        }
        repository.deleteById(id);
    }
}
