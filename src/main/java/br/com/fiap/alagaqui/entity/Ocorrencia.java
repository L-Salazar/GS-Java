package br.com.fiap.alagaqui.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alagaqui_ocorrencias")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ocorrencia")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localizacao", nullable = false)
    private Localizacao localizacao;

    @Column(name = "titulo", nullable = false, length = 255)
    private String titulo;

    @Column(name = "descricao", length = 4000)
    private String descricao;

    @Column(name = "data_hora_ocorrencia", nullable = false)
    private LocalDateTime dataHoraOcorrencia;

    public Ocorrencia() {}

    public Ocorrencia(Usuario usuario, Localizacao localizacao, String titulo, String descricao, LocalDateTime dataHoraOcorrencia) {
        this.usuario = usuario;
        this.localizacao = localizacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
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
