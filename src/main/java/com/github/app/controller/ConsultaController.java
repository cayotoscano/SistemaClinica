package com.github.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.app.model.consulta.Consulta;
import com.github.app.model.consulta.ConsultaRepository;
import com.github.app.model.consulta.DadosAgendamentoConsulta;
import com.github.app.model.medico.MedicosRepository;
import com.github.app.model.paciente.PacientesRepository;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicosRepository medicoRepository;

    @Autowired
    private PacientesRepository pacienteRepository;

    @PostMapping
    public Consulta agendar(@RequestBody DadosAgendamentoConsulta dados) {
        var medico = medicoRepository.getReferenceById(dados.medicoId());
        var paciente = pacienteRepository.getReferenceById(dados.pacienteId());

        var consulta = new Consulta(dados);
        // consulta.setMedico(medico);
        // consulta.setPaciente(paciente);

        return consulta;

    }

}
