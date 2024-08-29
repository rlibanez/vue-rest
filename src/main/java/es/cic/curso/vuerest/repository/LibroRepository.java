package es.cic.curso.vuerest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cic.curso.vuerest.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByAutorId(Long autorId);

}
