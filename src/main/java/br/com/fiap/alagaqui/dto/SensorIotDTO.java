package br.com.fiap.alagaqui.dto;

import java.time.LocalDateTime;

public class SensorIotDTO {

    private Long id;
    private Long idLocalizacao;
    private Long idTipoSensor;
    private LocalDateTime dataInstalacaoSensor;
    private String statusSensor;

    public SensorIotDTO() {}

    public SensorIotDTO(Long id, Long idLocalizacao, Long idTipoSensor, LocalDateTime dataInstalacaoSensor, String statusSensor) {
        this.id = id;
        this.idLocalizacao = idLocalizacao;
        this.idTipoSensor = idTipoSensor;
        this.dataInstalacaoSensor = dataInstalacaoSensor;
        this.statusSensor = statusSensor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Long getIdTipoSensor() {
        return idTipoSensor;
    }

    public void setIdTipoSensor(Long idTipoSensor) {
        this.idTipoSensor = idTipoSensor;
    }

    public LocalDateTime getDataInstalacaoSensor() {
        return dataInstalacaoSensor;
    }

    public void setDataInstalacaoSensor(LocalDateTime dataInstalacaoSensor) {
        this.dataInstalacaoSensor = dataInstalacaoSensor;
    }

    public String getStatusSensor() {
        return statusSensor;
    }

    public void setStatusSensor(String statusSensor) {
        this.statusSensor = statusSensor;
    }
}
