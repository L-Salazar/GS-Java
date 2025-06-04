package br.com.fiap.alagaqui.dto;

import java.time.LocalDateTime;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataUltimaCriacaoRelato;

    public UsuarioDTO() {}

    public UsuarioDTO(Long id, String nome, String email, String senha, LocalDateTime dataUltimaCriacaoRelato) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataUltimaCriacaoRelato = dataUltimaCriacaoRelato;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataUltimaCriacaoRelato() {
        return dataUltimaCriacaoRelato;
    }

    public void setDataUltimaCriacaoRelato(LocalDateTime dataUltimaCriacaoRelato) {
        this.dataUltimaCriacaoRelato = dataUltimaCriacaoRelato;
    }
}
