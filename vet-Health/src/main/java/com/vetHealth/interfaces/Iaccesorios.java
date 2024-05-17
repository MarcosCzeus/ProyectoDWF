package com.vetHealth.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.vetHealth.modelo.accesorios;
import org.springframework.stereotype.Service;
@Service
public  interface Iaccesorios extends CrudRepository<accesorios,Integer> {
    
}
