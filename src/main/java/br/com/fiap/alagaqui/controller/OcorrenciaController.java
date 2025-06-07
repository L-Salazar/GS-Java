package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.Ocorrencia;
import br.com.fiap.alagaqui.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia criar(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.salvar(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return ocorrenciaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Ocorrencia buscarPorId(@PathVariable Long id) {
        return ocorrenciaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Ocorrencia atualizar(@PathVariable Long id, @RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.atualizar(id, ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        ocorrenciaService.deletar(id);
    }
}
