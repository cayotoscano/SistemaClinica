package com.github.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.app.model.medico.DadosCadastroMedico;
import com.github.app.model.medico.Medico;
import com.github.app.model.medico.MedicosRepository;

@RestController // SPRING WEB
@RequestMapping("medicos")
public class MedicoController {
    
    @Autowired
    private MedicosRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

   
}
