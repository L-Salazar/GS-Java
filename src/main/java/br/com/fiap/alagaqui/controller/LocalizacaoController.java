package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.Localizacao;
import br.com.fiap.alagaqui.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localizacoes")
public class LocalizacaoController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @PostMapping
    public Localizacao criar(@RequestBody Localizacao localizacao) {
        return localizacaoService.salvar(localizacao);
    }

    @GetMapping
    public List<Localizacao> listar() {
        return localizacaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Localizacao buscarPorId(@PathVariable Long id) {
        return localizacaoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Localizacao atualizar(@PathVariable Long id, @RequestBody Localizacao localizacao) {
        return localizacaoService.atualizar(id, localizacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        localizacaoService.deletar(id);
    }
}
