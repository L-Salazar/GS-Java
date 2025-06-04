package br.com.fiap.alagaqui.dto;

import java.time.LocalDateTime;

public class AlertaDTO {

    private Long id;
    private Long idTipoAlerta;
    private String descricaoTipoAlerta;
    private String mensagem;
    private LocalDateTime dataHoraCriacao;
    private String resolvido;

    public AlertaDTO() {
    }

    public AlertaDTO(Long id, Long idTipoAlerta, String descricaoTipoAlerta, String mensagem, LocalDateTime dataHoraCriacao, String resolvido) {
        this.id = id;
        this.idTipoAlerta = idTipoAlerta;
        this.descricaoTipoAlerta = descricaoTipoAlerta;
        this.mensagem = mensagem;
        this.dataHoraCriacao = dataHoraCriacao;
        this.resolvido = resolvido;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTipoAlerta() {
        return idTipoAlerta;
    }

    public void setIdTipoAlerta(Long idTipoAlerta) {
        this.idTipoAlerta = idTipoAlerta;
    }

    public String getDescricaoTipoAlerta() {
        return descricaoTipoAlerta;
    }

    public void setDescricaoTipoAlerta(String descricaoTipoAlerta) {
        this.descricaoTipoAlerta = descricaoTipoAlerta;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public String getResolvido() {
        return resolvido;
    }

    public void setResolvido(String resolvido) {
        this.resolvido = resolvido;
    }
}
