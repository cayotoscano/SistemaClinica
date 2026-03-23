package com.github.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.app.model.paciente.DadosCadastroPaciente;
import com.github.app.model.paciente.Paciente;
import com.github.app.model.paciente.PacientesRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacientesRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

}
