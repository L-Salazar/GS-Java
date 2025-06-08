package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.Ocorrencia;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository repository;

    public Ocorrencia salvar(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public List<Ocorrencia> listarTodos() {
        final List<Ocorrencia> ocorrencias = repository.findAll();
        System.out.println("Listando ocorrências: " + ocorrencias.size() + " registros encontrados.");
        System.out.println("Detalhes das ocorrências:" + ocorrencias.get(0).getLocalizacao().getLatitude());
        System.out.println("Detalhes das ocorrências:" + ocorrencias.get(0).getLocalizacao().getLongitude());
        return repository.findAll();
    }

    public Ocorrencia buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ocorrência com ID " + id + " não encontrada."));
    }

    public Ocorrencia atualizar(Long id, Ocorrencia ocorrenciaAtualizada) {
        Ocorrencia existente = buscarPorId(id);

        existente.setUsuario(ocorrenciaAtualizada.getUsuario());
        existente.setLocalizacao(ocorrenciaAtualizada.getLocalizacao());
        existente.setTitulo(ocorrenciaAtualizada.getTitulo());
        existente.setDescricao(ocorrenciaAtualizada.getDescricao());
        existente.setDataHoraOcorrencia(ocorrenciaAtualizada.getDataHoraOcorrencia());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Ocorrência com ID " + id + " não encontrada para exclusão.");
        }
        repository.deleteById(id);
    }
}
