package br.com.fiap.alagaqui.entity;

import br.com.fiap.alagaqui.config.CustomDoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_alagaqui_localizacoes")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private Long id;

    @Column(name = "nome_localizacao", nullable = false, length = 150)
    private String nome;

    @JsonSerialize(using = CustomDoubleSerializer.class)
    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @JsonSerialize(using = CustomDoubleSerializer.class)
    @Column(name = "longitude", nullable = false)
    private Double longitude;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
