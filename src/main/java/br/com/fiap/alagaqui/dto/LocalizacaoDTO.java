package br.com.fiap.alagaqui.dto;

import java.math.BigDecimal;

public class LocalizacaoDTO {

    private Long id;
    private String nome;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public LocalizacaoDTO() {}

    public LocalizacaoDTO(Long id, String nome, BigDecimal latitude, BigDecimal longitude) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

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

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
