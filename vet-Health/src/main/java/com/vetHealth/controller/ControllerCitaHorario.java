package com.vetHealth.controller;

import com.vetHealth.interfacesServices.IcitahorarioService;
import com.vetHealth.modelo.citahorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.Optional;

@Controller // Anotación para marcar esta clase como un controlador
@RequestMapping
public class ControllerCitaHorario {

    @Autowired
    private IcitahorarioService service;

    @GetMapping("/ingresar")
    public String pagina1() {
        return "login";
        // Nombre de la plantilla Thymeleaf para la página 1
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
        // Nombre de la plantilla Thymeleaf para la página 1
    }



    @GetMapping("/listar") // Mapea esta ruta a este método cuando se recibe una solicitud GET
    public String listar(Model model){
        List<citahorario> citahorarios = service.listar();
        model.addAttribute("citahorarios", citahorarios);
        return "listar"; // Retorna el nombre de la vista a la que se redirigirá
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("citahorario",new citahorario());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated citahorario c, Model model){
        service.save(c);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id,Model model){
        Optional<citahorario> citahorarios = service.listarid(id);
        model.addAttribute("citahorario",citahorarios);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
