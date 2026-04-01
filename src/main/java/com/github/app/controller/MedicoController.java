package com.github.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.github.app.model.medico.DadosAtualizacaoMedico;
import com.github.app.model.medico.DadosCadastroMedico;
import com.github.app.model.medico.DadosListagemMedico;
import com.github.app.model.medico.Medico;
import com.github.app.model.medico.MedicosRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController // SPRING WEB
@RequestMapping("medicos")
public class MedicoController {
    
    @Autowired
    private MedicosRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping("todos")
    public List<Medico> listarTodos() {
        return repository.findAll();
    }
    
    @GetMapping("listar")
    public List<DadosListagemMedico> listar() {
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
    
    @GetMapping
    public Page<DadosListagemMedico> listarPorPagina(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);

        // return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }

    @PutMapping
    public void atualizar(@RequestBody DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id()); 
        medico.atualizarInformacoes(dados);

    }
   
}
