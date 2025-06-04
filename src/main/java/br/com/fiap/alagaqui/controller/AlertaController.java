package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.Alerta;
import br.com.fiap.alagaqui.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    @PostMapping
    public Alerta criar(@RequestBody Alerta alerta) {
        return alertaService.salvar(alerta);
    }

    @GetMapping
    public List<Alerta> listar() {
        return alertaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Alerta buscarPorId(@PathVariable Long id) {
        return alertaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Alerta atualizar(@PathVariable Long id, @RequestBody Alerta alerta) {
        return alertaService.atualizar(id, alerta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alertaService.deletar(id);
    }
}
