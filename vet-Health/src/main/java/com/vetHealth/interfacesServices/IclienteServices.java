package com.vetHealth.interfacesServices;
import com.vetHealth.modelo.cliente;

import java.util.List;
import java.util.Optional;

public interface IclienteServices {

    public List<cliente> listar();
    public Optional<cliente> listarid(int id);
    public int save(cliente c);
    public void delete(int id);

}
