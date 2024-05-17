package com.vetHealth.service;

import com.vetHealth.interfaces.Icitahorario;
import com.vetHealth.interfacesServices.IcitahorarioService;
import com.vetHealth.modelo.citahorario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CItaHorarioService  implements IcitahorarioService {

    @Autowired
    private Icitahorario data;
    @Override
    public List<citahorario> listar() {
        return (List<citahorario>) data.findAll();
    }

    @Override
    public Optional<citahorario> listarid(int id) {
        return data.findById(id);
    }

    @Override
    public int save(citahorario p) {
        int res=0;
        citahorario cita=data.save(p);
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
