package com.vetHealth.interfacesServices;

import com.vetHealth.modelo.citahorario;


import java.util.List;
import java.util.Optional;

public interface IcitahorarioService {

    public List<citahorario> listar();
    public Optional<citahorario> listarid(int id);
    public int save(citahorario p);
    public void delete(int id);
}
