package com.vetHealth.service;

import java.util.List;
import java.util.Optional;

import com.vetHealth.interfaces.Icastracion;
import com.vetHealth.interfacesServices.IcastracionService;
import com.vetHealth.modelo.castracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CastracionService  implements IcastracionService {

    @Autowired
    private Icastracion data;
    @Override
    public List<castracion> listar() {
        return (List<castracion>) data.findAll();
    }

    @Override
    public Optional<castracion> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(castracion p) {
        int res=0;
        castracion cita=data.save(p);
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