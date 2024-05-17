package com.vetHealth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vetHealth.interfacesServices.IveterinarioService;
import com.vetHealth.modelo.veterinario;


    

    @Controller // Anotación para marcar esta clase como un controlador
@RequestMapping
public class ControllerVeterinario {

    @Autowired
    private IveterinarioService service;


    @GetMapping("/listarv")
    public String vlistar(Model model){
        List<veterinario> veterinarios = service.listar();
        model.addAttribute("veterinarios", veterinarios);
        return "vlistar"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/newv")
    public String vagregar(Model model){
        model.addAttribute("veterinario",new veterinario());
        return "vform";
    }

    @PostMapping("/savev")
    public String savev(@Validated veterinario c, Model model){
        service.save(c); // Guarda el cliente
        List<veterinario> veterinarios = service.listar(); // Obtiene la lista actualizada de clientes
        model.addAttribute("veterinarios", veterinarios); // Agrega la lista al modelo
        return "vlistar"; // Retorna la vista que muestra la lista actualizada de clientes
    }
    

    @GetMapping("/veditar/{id}")
    public String veditar(@PathVariable int id, Model model){
        Optional<veterinario> veterinarios = service.listarid(id);
        model.addAttribute("veterinario",veterinarios);
        return "vform";
    }

    @GetMapping("/veliminar/{id}")
    public String vdelete(@PathVariable int id) {
        service.delete(id); // Elimina el cliente con el ID proporcionado
        return "vlistar"; // Retorna el nombre de la vista que muestra la lista actualizada de clientes
    }
}
