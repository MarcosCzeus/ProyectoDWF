package com.vetHealth.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name="mascota")
public class mascota {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String genero;

    public mascota(int id, String nombre, String especie, String raza, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    public mascota() {

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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
