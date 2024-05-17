package com.vetHealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vetHealth.modelo.accesorios;
import com.vetHealth.interfaces.Iaccesorios;
import java.util.List;
import java.util.Optional;
import com.vetHealth.interfacesServices.IaccesoriosService;

@Service
public class AccesoriosService implements IaccesoriosService{

    @Autowired
    private Iaccesorios data;
    @Override
    public List<accesorios> listar() {
        return (List<accesorios>) data.findAll();
    }

    @Override
    public Optional<accesorios> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(accesorios c) {
        int resu=0;
        accesorios masco=data.save(c);
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





   
