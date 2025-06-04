package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.LeituraSensor;
import br.com.fiap.alagaqui.service.LeituraSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leituras-sensor")
public class LeituraSensorController {

    @Autowired
    private LeituraSensorService leituraSensorService;

    @PostMapping
    public LeituraSensor criar(@RequestBody LeituraSensor leituraSensor) {
        return leituraSensorService.salvar(leituraSensor);
    }

    @GetMapping
    public List<LeituraSensor> listar() {
        return leituraSensorService.listarTodos();
    }

    @GetMapping("/{id}")
    public LeituraSensor buscarPorId(@PathVariable Long id) {
        return leituraSensorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public LeituraSensor atualizar(@PathVariable Long id, @RequestBody LeituraSensor leituraSensor) {
        return leituraSensorService.atualizar(id, leituraSensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        leituraSensorService.deletar(id);
    }
}
