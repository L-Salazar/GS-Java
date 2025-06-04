package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.SensorIot;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.SensorIotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorIotService {

    @Autowired
    private SensorIotRepository repository;

    public SensorIot salvar(SensorIot sensorIot) {
        return repository.save(sensorIot);
    }

    public List<SensorIot> listarTodos() {
        return repository.findAll();
    }

    public SensorIot buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor IoT com ID " + id + " não encontrado."));
    }

    public SensorIot atualizar(Long id, SensorIot sensorIotAtualizado) {
        SensorIot existente = buscarPorId(id);

        existente.setLocalizacao(sensorIotAtualizado.getLocalizacao());
        existente.setTipoSensor(sensorIotAtualizado.getTipoSensor());
        existente.setDataInstalacaoSensor(sensorIotAtualizado.getDataInstalacaoSensor());
        existente.setStatusSensor(sensorIotAtualizado.getStatusSensor());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Sensor IoT com ID " + id + " não encontrado para exclusão.");
        }
        repository.deleteById(id);
    }
}
