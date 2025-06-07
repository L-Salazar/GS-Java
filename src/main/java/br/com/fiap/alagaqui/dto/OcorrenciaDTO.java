package br.com.fiap.alagaqui.dto;

import java.time.LocalDateTime;

public class OcorrenciaDTO {

    private Long id;
    private Long idUsuario;
    private Long idLocalizacao;
    private String titulo;
    private String descricao;
    private LocalDateTime dataHoraOcorrencia;

    public OcorrenciaDTO() {}

    public OcorrenciaDTO(Long id, Long idUsuario, Long idLocalizacao, String titulo, String descricao, LocalDateTime dataHoraOcorrencia) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLocalizacao = idLocalizacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraOcorrencia() {
        return dataHoraOcorrencia;
    }

    public void setDataHoraOcorrencia(LocalDateTime dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
    }
}
