package com.vetHealth.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="login")
public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String correo;
    private String password;

    public login(Long id, String usuario, String correo, String password) {
        this.id = id;
        this.usuario = usuario;
        this.correo = correo;
        this.password = password;
    }

    public login(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
