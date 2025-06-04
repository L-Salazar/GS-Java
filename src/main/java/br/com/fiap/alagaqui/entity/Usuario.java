package br.com.fiap.alagaqui.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alagaqui_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome_usuario", nullable = false, length = 100)
    private String nome;

    @Column(name = "email_usuario", nullable = false, unique = true, length = 150)
    private String email;

    @Column(name = "senha_usuario", nullable = false, length = 255)
    private String senha;

    @Column(name = "data_ultima_criacao_relato")
    private LocalDateTime dataUltimaCriacaoRelato;

    public Usuario() {}

    public Usuario(String nome, String email, String senha, LocalDateTime dataUltimaCriacaoRelato) {
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