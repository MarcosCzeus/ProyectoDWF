package com.vetHealth.service;

import java.util.List;
import java.util.Optional;
import com.vetHealth.interfaces.Imascota;
import com.vetHealth.interfacesServices.ImascotaService;
import com.vetHealth.modelo.mascota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MascotaService implements ImascotaService{
    @Autowired
    private Imascota data;
    @Override
    public List<mascota> listar() {
        return (List<mascota>) data.findAll();
    }

    @Override
    public Optional<mascota> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(mascota c) {
        int resu=0;
        mascota masco=data.save(c);
        if(!masco.equals(null)) {
            resu=1;
        }
        return resu;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
