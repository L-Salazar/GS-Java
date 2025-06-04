package br.com.fiap.alagaqui.dto;

import java.time.LocalDateTime;

public class LeituraSensorDTO {

    private Long id;
    private Long idSensor;
    private LocalDateTime dataHoraLeitura;
    private Double nivelAguaLeitura;
    private String estaEntupidoSensor;
    private Double taxaFluxoSensor;

    public LeituraSensorDTO() {}

    public LeituraSensorDTO(Long id, Long idSensor, LocalDateTime dataHoraLeitura, Double nivelAguaLeitura, String estaEntupidoSensor, Double taxaFluxoSensor) {
        this.id = id;
        this.idSensor = idSensor;
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

    public Long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
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
