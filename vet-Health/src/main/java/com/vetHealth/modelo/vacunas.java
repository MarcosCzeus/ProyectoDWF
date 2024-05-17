package com.vetHealth.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "vacunas")
public class vacunas {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    public String nombre;
    public String descripcion;
    public String precio;

    public vacunas(int id, String nombre, String descripcion, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
public  vacunas(){}
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}