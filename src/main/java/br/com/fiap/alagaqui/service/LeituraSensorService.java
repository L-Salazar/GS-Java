package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.LeituraSensor;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.LeituraSensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeituraSensorService {

    @Autowired
    private LeituraSensorRepository repository;

    public LeituraSensor salvar(LeituraSensor leituraSensor) {
        return repository.save(leituraSensor);
    }

    public List<LeituraSensor> listarTodos() {
        return repository.findAll();
    }

    public LeituraSensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Leitura de Sensor com ID " + id + " não encontrada."));
    }

    public LeituraSensor atualizar(Long id, LeituraSensor leituraSensorAtualizada) {
        LeituraSensor existente = buscarPorId(id);

        existente.setSensor(leituraSensorAtualizada.getSensor());
        existente.setDataHoraLeitura(leituraSensorAtualizada.getDataHoraLeitura());
        existente.setNivelAguaLeitura(leituraSensorAtualizada.getNivelAguaLeitura());
        existente.setEstaEntupidoSensor(leituraSensorAtualizada.getEstaEntupidoSensor());
        existente.setTaxaFluxoSensor(leituraSensorAtualizada.getTaxaFluxoSensor());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Leitura de Sensor com ID " + id + " não encontrada para exclusão.");
        }
        repository.deleteById(id);
    }
}
