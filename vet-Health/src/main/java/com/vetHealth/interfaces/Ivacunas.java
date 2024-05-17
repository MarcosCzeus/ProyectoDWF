package com.vetHealth.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.vetHealth.modelo.vacunas;

import org.springframework.stereotype.Service;

@Service
public  interface Ivacunas extends CrudRepository<vacunas,Integer> {
    
}
