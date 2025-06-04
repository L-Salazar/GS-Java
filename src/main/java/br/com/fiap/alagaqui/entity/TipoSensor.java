package br.com.fiap.alagaqui.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_alagaqui_tipos_sensores")
public class TipoSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_sensor")
    private Long id;

    @Column(name = "descricao_tipo_sensor", nullable = false, unique = true, length = 50)
    private String descricao;

    public TipoSensor() {}

    public TipoSensor(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
