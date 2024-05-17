package com.vetHealth.interfacesServices;

import java.util.List;
import java.util.Optional;
import com.vetHealth.modelo.mascota;

public interface ImascotaService {
    public List<mascota> listar();
    public Optional<mascota> listarid(int id);
    public int save(mascota c);
    public void delete(int id);
}
