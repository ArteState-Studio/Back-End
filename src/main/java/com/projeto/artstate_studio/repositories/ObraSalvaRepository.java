package com.projeto.artstate_studio.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.artstate_studio.entities.ObraSalva;

public interface ObraSalvaRepository extends JpaRepository<ObraSalva, Long> {

    // buscar obra por titulo
    List<ObraSalva> findByTituloContainingIgnoreCase(String titulo);

}