package com.vetHealth.interfacesServices;

import com.vetHealth.modelo.control;

import java.util.List;
import java.util.Optional;

public interface IcontrolService {

    public List<control> listar(); // Método para listar todos los controles
    public Optional<control> listarId(int id); // Método para obtener un control por su ID
    public int save(control control); // Método para guardar un nuevo control
    public void delete(int id); // Método para eliminar un control por su ID
}
