package com.vetHealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.vetHealth.interfacesServices.IcontrolService;
import com.vetHealth.interfaces.Icontrol;
import com.vetHealth.modelo.control;

@Service
public class ControlService implements IcontrolService{



    @Autowired
    private Icontrol data;
    @Override
    public List<control> listar() {
        return (List<control>) data.findAll();
    }

    @Override
    public Optional<control> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(control c) {
        int resu=0;
        control masco=data.save(c);
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

