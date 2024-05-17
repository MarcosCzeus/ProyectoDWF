package com.vetHealth.interfaces;
import com.vetHealth.modelo.citahorario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface Icitahorario extends CrudRepository<citahorario,Integer> {
}
