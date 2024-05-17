package com.vetHealth.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vetHealth.interfacesServices.IvacunasService;
import com.vetHealth.interfaces.Ivacunas;
import com.vetHealth.modelo.vacunas;
import java.util.List;
import java.util.Optional;

@Service
public class VacunasService implements IvacunasService{



    @Autowired
    private Ivacunas data;
    @Override
    public List<vacunas> listar() {
        return (List<vacunas>) data.findAll();
    }

    @Override
    public Optional<vacunas> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(vacunas c) {
        int resu=0;
        vacunas masco=data.save(c);
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
