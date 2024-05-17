package com.vetHealth.interfacesServices;

import com.vetHealth.modelo.accesorios;

import java.util.List;
import java.util.Optional;

public interface IaccesoriosService {

    public List<accesorios> listar(); // Método para listar todos los controles
    public Optional<accesorios> listarId(int id); // Método para obtener un control por su ID
    public int save(accesorios c); // Método para guardar un nuevo control
    public void delete(int id); // Método para eliminar un control por su ID
}
