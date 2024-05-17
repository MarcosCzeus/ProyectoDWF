package com.vetHealth.interfaces;
import com.vetHealth.modelo.cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface Icliente extends CrudRepository<cliente,Integer> {

}
