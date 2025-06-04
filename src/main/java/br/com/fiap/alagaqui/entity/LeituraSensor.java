package br.com.fiap.alagaqui.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alagaqui_leituras_sensores")
public class LeituraSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_leitura")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sensor", nullable = false)
    private SensorIot sensor;

    @Column(name = "data_hora_leitura", nullable = false)
    private LocalDateTime dataHoraLeitura;

    @Column(name = "nivel_agua_leitura")
    private Double nivelAguaLeitura;

    @Column(name = "esta_entupido_sensor", nullable = false, length = 1)
    private String estaEntupidoSensor = "N";  // Valores: 'S' ou 'N'

    @Column(name = "taxa_fluxo_sensor")
    private Double taxaFluxoSensor;

    public LeituraSensor() {}

    public LeituraSensor(SensorIot sensor, LocalDateTime dataHoraLeitura, Double nivelAguaLeitura, String estaEntupidoSensor, Double taxaFluxoSensor) {
        this.sensor = sensor;
        this.dataHoraLeitura = dataHoraLeitura;
        this.nivelAguaLeitura = nivelAguaLeitura;
        this.estaEntupidoSensor = estaEntupidoSensor;
        this.taxaFluxoSensor = taxaFluxoSensor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SensorIot getSensor() {
        return sensor;
    }

    public void setSensor(SensorIot sensor) {
        this.sensor = sensor;
    }

    public LocalDateTime getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(LocalDateTime dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Double getNivelAguaLeitura() {
        return nivelAguaLeitura;
    }

    public void setNivelAguaLeitura(Double nivelAguaLeitura) {
        this.nivelAguaLeitura = nivelAguaLeitura;
    }

    public String getEstaEntupidoSensor() {
        return estaEntupidoSensor;
    }

    public void setEstaEntupidoSensor(String estaEntupidoSensor) {
        this.estaEntupidoSensor = estaEntupidoSensor;
    }

    public Double getTaxaFluxoSensor() {
        return taxaFluxoSensor;
    }

    public void setTaxaFluxoSensor(Double taxaFluxoSensor) {
        this.taxaFluxoSensor = taxaFluxoSensor;
    }
}
