package com.vetHealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.vetHealth.interfaces.Iveterinario;
import com.vetHealth.interfacesServices.IveterinarioService;
import com.vetHealth.modelo.veterinario;
import org.springframework.stereotype.Service;

@Service
public class VeterinarioService  implements IveterinarioService {
     @Autowired
    private Iveterinario data;
    @Override
    public List<veterinario> listar() {
        return (List<veterinario>) data.findAll();
    }

    @Override
    public Optional<veterinario> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(veterinario v) {
        int res=0;
        veterinario cita=data.save(v);
        if(!cita.equals(null)) {
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
