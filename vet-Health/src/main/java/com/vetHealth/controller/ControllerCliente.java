package com.vetHealth.controller;


import com.vetHealth.interfacesServices.IclienteServices;
import com.vetHealth.modelo.cliente;
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
public class ControllerCliente {

    @Autowired
    private IclienteServices service;


    @GetMapping("/listarform")
    public String clistar(Model model){
        List<cliente> clientes = service.listar();
        model.addAttribute("clientes", clientes);
        return "clistar"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/newc")
    public String cagregar(Model model){
        model.addAttribute("cliente",new cliente());
        return "cform";
    }

    @PostMapping("/saves")
    public String saves(@Validated cliente c, Model model){
        service.save(c); // Guarda el cliente
        List<cliente> clientes = service.listar(); // Obtiene la lista actualizada de clientes
        model.addAttribute("clientes", clientes); // Agrega la lista al modelo
        return "clistar"; // Retorna la vista que muestra la lista actualizada de clientes
    }
    

    @GetMapping("/ceditar/{id}")
    public String ceditar(@PathVariable int id, Model model){
        Optional<cliente> clientes = service.listarid(id);
        model.addAttribute("cliente",clientes);
        return "cform";
    }

    @GetMapping("/celiminar/{id}")
    public String cdelete(@PathVariable int id) {
        service.delete(id); // Elimina el cliente con el ID proporcionado
        return "clistar"; // Retorna el nombre de la vista que muestra la lista actualizada de clientes
    }

    
}
