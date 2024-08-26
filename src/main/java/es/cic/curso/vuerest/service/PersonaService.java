package es.cic.curso.vuerest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso.vuerest.model.Persona;
import es.cic.curso.vuerest.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public long crearPersona(String nombre, String apellidos, int annoNacimiento) {
        Persona persona = new Persona(nombre, apellidos, annoNacimiento);
        personaRepository.save(persona);
        return persona.getId();
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

}
