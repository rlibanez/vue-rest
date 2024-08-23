package es.cic.curso.vuerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso.vuerest.model.Persona;
import es.cic.curso.vuerest.service.PersonaService;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable Long id) {
        return personaService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.findAll();
    }
}
