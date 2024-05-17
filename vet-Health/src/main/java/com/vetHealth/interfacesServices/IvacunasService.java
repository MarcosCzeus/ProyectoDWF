package com.vetHealth.interfacesServices;


import com.vetHealth.modelo.vacunas;

import java.util.List;
import java.util.Optional;

public interface IvacunasService {

    public List<vacunas> listar(); // Método para listar todos los controles
    public Optional<vacunas> listarId(int id); // Método para obtener un control por su ID
    public int save(vacunas control); // Método para guardar un nuevo control
    public void delete(int id); // Método para eliminar un control por su ID
}
