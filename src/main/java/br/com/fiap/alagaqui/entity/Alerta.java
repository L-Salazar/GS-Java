package br.com.fiap.alagaqui.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alagaqui_alertas")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_alerta", nullable = false)
    private TipoAlerta tipoAlerta;

    @Column(name = "mensagem_alerta", nullable = false, length = 4000)
    private String mensagem;

    @Column(name = "data_hora_criacao_alerta", nullable = false)
    private LocalDateTime dataHoraCriacao;

    @Column(name = "resolvido_alerta", nullable = false, length = 1)
    private String resolvido = "N";  // Valores possíveis: 'S' ou 'N'

    public Alerta() {}

    public Alerta(TipoAlerta tipoAlerta, String mensagem, LocalDateTime dataHoraCriacao, String resolvido) {
        this.tipoAlerta = tipoAlerta;
        this.mensagem = mensagem;
        this.dataHoraCriacao = dataHoraCriacao;
        this.resolvido = resolvido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAlerta getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(TipoAlerta tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
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
