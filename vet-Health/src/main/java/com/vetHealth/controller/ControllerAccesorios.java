package com.vetHealth.controller;


import com.vetHealth.interfacesServices.IaccesoriosService;
import com.vetHealth.modelo.accesorios;
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
public class ControllerAccesorios {

    @Autowired
    private IaccesoriosService service;


    @GetMapping("/listarac")
    public String clistar(Model model){
        List<accesorios> accesorios = service.listar();
        model.addAttribute("accesorios", accesorios);
        return "aclist"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/newac")
    public String cagregar(Model model){
        model.addAttribute("accesorios",new accesorios());
        return "acform";
    }

    @PostMapping("/saveac")
    public String saves(@Validated accesorios c, Model model){
        service.save(c); // Guarda el cliente
        List<accesorios> accesorios = service.listar(); // Obtiene la lista actualizada de clientes
        model.addAttribute("accesorios", accesorios); // Agrega la lista al modelo
        return "aclist"; // Retorna la vista que muestra la lista actualizada de clientes
    }
    

    @GetMapping("/aceditar/{id}")
    public String ceditar(@PathVariable int id, Model model){
        Optional<accesorios> accesorios = service.listarId(id);
        model.addAttribute("accesorios",accesorios);
        return "acform";
    }

    @GetMapping("/aceliminar/{id}")
    public String cdelete(@PathVariable int id) {
        service.delete(id); // Elimina el cliente con el ID proporcionado
        return "aclist"; // Retorna el nombre de la vista que muestra la lista actualizada de clientes
    }

    
}
