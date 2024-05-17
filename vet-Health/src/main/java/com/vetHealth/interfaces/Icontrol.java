package com.vetHealth.interfaces;

import com.vetHealth.modelo.control;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public interface Icontrol extends CrudRepository<control,Integer>{
    
}
