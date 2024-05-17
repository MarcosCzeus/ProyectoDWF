package com.vetHealth.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.vetHealth.modelo.castracion;
import org.springframework.stereotype.Service;
@Service
public interface Icastracion extends CrudRepository<castracion,Integer> {
    
}
