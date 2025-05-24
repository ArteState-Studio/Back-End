package com.projeto.artstate_studio.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.artstate_studio.entities.ObraSalva;

public interface ObraSalvaRepository extends JpaRepository<ObraSalva, Long> {

    // Esse aqui é o único que você precisa adicionar
    List<ObraSalva> findByTituloContainingIgnoreCase(String titulo);

}