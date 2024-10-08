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

import es.cic.curso.vuerest.model.Libro;
import es.cic.curso.vuerest.service.LibroService;

@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/{id}")
    public Libro getLibro(@PathVariable Long id) {
        return libroService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @PutMapping
    public Libro updateLibro(@RequestBody Libro libroDetails) {
        Long id = libroDetails.getId();
        return libroService.findById(id).map(libro -> {
            libro.setTitulo(libroDetails.getTitulo());
            libro.setIsbn(libroDetails.getIsbn());
            libro.setAnnoPublicacion(libroDetails.getAnnoPublicacion());
            return libroService.save(libro);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroService.deleteById(id);
    }

}
