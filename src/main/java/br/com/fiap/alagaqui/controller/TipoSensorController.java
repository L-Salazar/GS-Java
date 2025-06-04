package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.TipoSensor;
import br.com.fiap.alagaqui.service.TipoSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos-sensor")
public class TipoSensorController {

    @Autowired
    private TipoSensorService tipoSensorService;

    @PostMapping
    public TipoSensor criar(@RequestBody TipoSensor tipoSensor) {
        return tipoSensorService.salvar(tipoSensor);
    }

    @GetMapping
    public List<TipoSensor> listar() {
        return tipoSensorService.listarTodos();
    }

    @GetMapping("/{id}")
    public TipoSensor buscarPorId(@PathVariable Long id) {
        return tipoSensorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public TipoSensor atualizar(@PathVariable Long id, @RequestBody TipoSensor tipoSensor) {
        return tipoSensorService.atualizar(id, tipoSensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tipoSensorService.deletar(id);
    }
}
