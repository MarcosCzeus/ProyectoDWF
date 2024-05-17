package com.vetHealth.controller;


import com.vetHealth.interfacesServices.IcastracionService;
import com.vetHealth.modelo.castracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller // Anotación para marcar esta clase como un controlador
@RequestMapping
public class ControllerCastracion {

    @Autowired
    private IcastracionService service;


    @GetMapping("/listarca")
    public String clistar(Model model){
        List<castracion> castracion = service.listar();
        model.addAttribute("castracion", castracion);
        return "calist"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/newca")
    public String cagregar(Model model){
        model.addAttribute("castracio",new castracion());
        return "caform";
    }

    @PostMapping("/saveca")
    public String saves(@Validated castracion c, Model model){
        service.save(c); // Guarda el cliente
        List<castracion> castracion = service.listar(); // Obtiene la lista actualizada de clientes
        model.addAttribute("castracion", castracion); // Agrega la lista al modelo
        return "calist"; // Retorna la vista que muestra la lista actualizada de clientes
    }
    

    @GetMapping("/caeditar/{id}")
    public String ceditar(@PathVariable int id, Model model){
        Optional<castracion> castracion = service.listarid(id);
        model.addAttribute("accesorio",castracion);
        return "acform";
    }

    @GetMapping("/caeliminar/{id}")
    public String cdelete(@PathVariable int id) {
        service.delete(id); // Elimina el cliente con el ID proporcionado
        return "calist"; // Retorna el nombre de la vista que muestra la lista actualizada de clientes
    }

    
}