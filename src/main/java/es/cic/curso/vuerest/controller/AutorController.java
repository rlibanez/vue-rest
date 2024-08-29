package es.cic.curso.vuerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso.vuerest.model.Autor;
import es.cic.curso.vuerest.model.Libro;
import es.cic.curso.vuerest.service.AutorService;

@RestController
// 1) Configuración de CORS a nivel de clase. Alternativa a
// CorsConfiguration.java
// @CrossOrigin(origins = "http://localhost:5174") // Permite solicitudes desde
// http://localhost:8080
@RequestMapping("/api/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/{id}")
    public Autor getAutor(@PathVariable Long id) {
        return autorService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Autor> getAllAutores() {
        return autorService.findAll();
    }

    @PostMapping
    public Autor createAutor(@RequestBody Autor persona) {
        return autorService.save(persona);
    }

    @PutMapping
    public Autor updateAutor(@RequestBody Autor personaDetails) {
        Long id = personaDetails.getId();
        return autorService.findById(id).map(persona -> {
            persona.setNombre(personaDetails.getNombre());
            persona.setApellidos(personaDetails.getApellidos());
            persona.setAnnoNacimiento(personaDetails.getAnnoNacimiento());
            return autorService.save(persona);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteById(id);
    }

    @GetMapping("/{id}/libros")
    public List<Libro> getLibrosByAutor(@PathVariable Long id) {
        return autorService.findLibrosByAutorId(id);
    }

}
