package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.TipoAlerta;
import br.com.fiap.alagaqui.service.TipoAlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos-alerta")
public class TipoAlertaController {

    @Autowired
    private TipoAlertaService tipoAlertaService;

    @PostMapping
    public TipoAlerta criar(@RequestBody TipoAlerta tipoAlerta) {
        return tipoAlertaService.salvar(tipoAlerta);
    }

    @GetMapping
    public List<TipoAlerta> listar() {
        return tipoAlertaService.listarTodos();
    }

    @GetMapping("/{id}")
    public TipoAlerta buscarPorId(@PathVariable Long id) {
        return tipoAlertaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public TipoAlerta atualizar(@PathVariable Long id, @RequestBody TipoAlerta tipoAlerta) {
        return tipoAlertaService.atualizar(id, tipoAlerta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tipoAlertaService.deletar(id);
    }
}
