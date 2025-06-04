package br.com.fiap.alagaqui.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alagaqui_sensores_iot")
public class SensorIot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localizacao", nullable = false)
    private Localizacao localizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_sensor", nullable = false)
    private TipoSensor tipoSensor;

    @Column(name = "data_instalacao_sensor", nullable = false)
    private LocalDateTime dataInstalacaoSensor;

    @Column(name = "status_sensor", nullable = false, length = 20)
    private String statusSensor = "ativo";

    public SensorIot() {}

    public SensorIot(Localizacao localizacao, TipoSensor tipoSensor, LocalDateTime dataInstalacaoSensor, String statusSensor) {
        this.localizacao = localizacao;
        this.tipoSensor = tipoSensor;
        this.dataInstalacaoSensor = dataInstalacaoSensor;
        this.statusSensor = statusSensor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public TipoSensor getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(TipoSensor tipoSensor) {
        this.tipoSensor = tipoSensor;
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
