package br.com.fiap.alagaqui.controller;

import br.com.fiap.alagaqui.entity.SensorIot;
import br.com.fiap.alagaqui.service.SensorIotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores-iot")
public class SensorIotController {

    @Autowired
    private SensorIotService sensorIotService;

    @PostMapping
    public SensorIot criar(@RequestBody SensorIot sensorIot) {
        return sensorIotService.salvar(sensorIot);
    }

    @GetMapping
    public List<SensorIot> listar() {
        return sensorIotService.listarTodos();
    }

    @GetMapping("/{id}")
    public SensorIot buscarPorId(@PathVariable Long id) {
        return sensorIotService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public SensorIot atualizar(@PathVariable Long id, @RequestBody SensorIot sensorIot) {
        return sensorIotService.atualizar(id, sensorIot);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        sensorIotService.deletar(id);
    }
}
