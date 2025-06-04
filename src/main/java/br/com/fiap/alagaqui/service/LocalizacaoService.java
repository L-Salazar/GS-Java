package br.com.fiap.alagaqui.service;

import br.com.fiap.alagaqui.entity.Localizacao;
import br.com.fiap.alagaqui.exception.ResourceNotFoundException;
import br.com.fiap.alagaqui.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository repository;

    public Localizacao salvar(Localizacao localizacao) {
        return repository.save(localizacao);
    }

    public List<Localizacao> listarTodos() {
        return repository.findAll();
    }

    public Localizacao buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Localização com ID " + id + " não encontrada."));
    }

    public Localizacao atualizar(Long id, Localizacao localizacaoAtualizada) {
        Localizacao existente = buscarPorId(id);

        existente.setNome(localizacaoAtualizada.getNome());
        existente.setLatitude(localizacaoAtualizada.getLatitude());
        existente.setLongitude(localizacaoAtualizada.getLongitude());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Localização com ID " + id + " não encontrada para exclusão.");
        }
        repository.deleteById(id);
    }
}
