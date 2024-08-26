package es.cic.curso.vuerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso.vuerest.model.Persona;
import es.cic.curso.vuerest.service.PersonaService;

@RestController
// 1) Configuración de CORS a nivel de clase. Alternativa a
// CorsConfiguration.java
// @CrossOrigin(origins = "http://localhost:5174") // Permite solicitudes desde
// http://localhost:8080
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

    @PutMapping("/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona personaDetails) {
        return personaService.findById(id).map(persona -> {
            persona.setNombre(personaDetails.getNombre());
            persona.setApellidos(personaDetails.getApellidos());
            persona.setAnnoNacimiento(personaDetails.getAnnoNacimiento());
            return personaService.save(persona);
        }).orElse(null);
    }
}
