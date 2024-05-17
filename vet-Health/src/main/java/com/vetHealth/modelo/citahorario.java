package com.vetHealth.modelo;


import jakarta.persistence.*;

@Entity
@Table (name="citahorario")
public class citahorario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String motivoconsulta;
    private String hora;
    private String mascota;
    private int numero;
    private String correo;

    public citahorario(int id, String nombre, String motivoconsulta, String hora, String mascota, int numero, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.motivoconsulta = motivoconsulta;
        this.hora = hora;
        this.mascota = mascota;
        this.numero = numero;
        this.correo = correo;
    }

    public citahorario()
    {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivoconsulta() {
        return motivoconsulta;
    }

    public void setMotivoconsulta(String motivoconsulta) {
        this.motivoconsulta = motivoconsulta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
