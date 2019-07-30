package ar.com.nuevapruebahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.nuevapruebahibernate.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
