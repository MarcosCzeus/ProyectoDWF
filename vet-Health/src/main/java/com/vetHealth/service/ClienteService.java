package com.vetHealth.service;

import com.vetHealth.interfaces.Icliente;
import com.vetHealth.interfacesServices.IclienteServices;
import com.vetHealth.modelo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IclienteServices {

    @Autowired
    private Icliente data;
    @Override
    public List<cliente> listar() {
        return (List<cliente>) data.findAll();
    }

    @Override
    public Optional<cliente> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(cliente c) {
        int resu=0;
        cliente clien=data.save(c);
        if(!clien.equals(null)) {
            resu=1;
        }
        return resu;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
