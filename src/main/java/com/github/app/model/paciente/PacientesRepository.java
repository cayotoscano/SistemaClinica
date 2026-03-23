package com.github.app.model.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<Paciente, Integer> {
    
}
