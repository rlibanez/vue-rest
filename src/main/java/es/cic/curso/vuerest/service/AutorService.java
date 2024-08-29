package es.cic.curso.vuerest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso.vuerest.model.Autor;
import es.cic.curso.vuerest.repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Optional<Autor> findById(Long id) {
        return autorRepository.findById(id);
    }

    public long crearPersona(String nombre, String apellidos, int annoNacimiento) {
        Autor persona = new Autor(nombre, apellidos, annoNacimiento);
        autorRepository.save(persona);
        return persona.getId();
    }

    public Autor save(Autor persona) {
        return autorRepository.save(persona);
    }

    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }
}
