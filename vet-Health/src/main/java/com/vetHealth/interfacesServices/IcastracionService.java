package com.vetHealth.interfacesServices;

import com.vetHealth.modelo.castracion;

import java.util.List;
import java.util.Optional;

public interface IcastracionService {

    public List<castracion> listar(); // Método para listar todas las castraciones
    public Optional<castracion> listarid(int id); // Método para obtener una castración por su ID
    public int save(castracion c); // Método para guardar una nueva castración
    public void delete(int id); // Método para eliminar una castración por su ID
}
