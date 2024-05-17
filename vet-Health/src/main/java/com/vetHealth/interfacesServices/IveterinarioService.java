package com.vetHealth.interfacesServices;

import com.vetHealth.modelo.veterinario;

import java.util.List;
import java.util.Optional;

public interface IveterinarioService {
    public List<veterinario> listar();
    public Optional<veterinario> listarid(int id);
    public int save(veterinario c);
    public void delete(int id);
}
