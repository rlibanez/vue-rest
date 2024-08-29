package es.cic.curso.vuerest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso.vuerest.model.Libro;
import es.cic.curso.vuerest.repository.LibroRepository;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    public long crearLibro(String titulo, String isbn, int annoPublicacion) {
        Libro libro = new Libro(titulo, isbn, annoPublicacion);
        libroRepository.save(libro);
        return libro.getId();
    }

    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }

}
