package com.vetHealth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import com.vetHealth.interfacesServices.ImascotaService;
import com.vetHealth.modelo.mascota;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller // Anotación para marcar esta clase como un controlador
@RequestMapping
public class ControllerMascota {
       @Autowired
    private ImascotaService service;


    @GetMapping("/listarm")
    public String mlistar(Model model){
        List<mascota> mascotas = service.listar();
        model.addAttribute("mascotas", mascotas);
        return "mlistar"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/newm")
    public String magregar(Model model){
        model.addAttribute("mascota",new mascota());
        return "mform";
    }

    @PostMapping("/savem")
    public String msaves(@Validated mascota c, Model model){
        service.save(c); // Guarda el cliente
        List<mascota> mascotas = service.listar(); // Obtiene la lista actualizada de clientes
        model.addAttribute("mascotas", mascotas); // Agrega la lista al modelo
        return "mlistar"; // Retorna la vista que muestra la lista actualizada de clientes
    }
    

    @GetMapping("/meditar/{id}")
    public String meditar(@PathVariable int id, Model model){
        Optional<mascota> mascotas = service.listarid(id);
        model.addAttribute("mascota",mascotas);
        return "mform";
    }

    @GetMapping("/meliminar/{id}")
    public String mdelete(@PathVariable int id) {
        service.delete(id); // Elimina el cliente con el ID proporcionado
        return "mlistar"; // Retorna el nombre de la vista que muestra la lista actualizada de clientes
    }
}
