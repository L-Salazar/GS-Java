package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.TipoSensor;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.TipoSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoSensorService {

    @Autowired
    private TipoSensorRepository repository;

    public TipoSensor salvar(TipoSensor tipoSensor) {
        return repository.save(tipoSensor);
    }

    public List<TipoSensor> listarTodos() {
        return repository.findAll();
    }

    public TipoSensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TipoSensor com ID " + id + " não encontrado."));
    }

    public TipoSensor atualizar(Long id, TipoSensor tipoSensorAtualizado) {
        TipoSensor existente = buscarPorId(id);

        existente.setDescricao(tipoSensorAtualizado.getDescricao());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("TipoSensor com ID " + id + " não encontrado para exclusão.");
        }
        repository.deleteById(id);
    }
}
