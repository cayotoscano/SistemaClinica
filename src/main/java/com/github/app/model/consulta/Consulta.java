package com.github.app.model.consulta;

import java.time.LocalDateTime;

import com.github.app.model.medico.Medico;
import com.github.app.model.paciente.Paciente;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "consultas")
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "medico_id")
    @ManyToOne
    private Integer medico;

    @JoinColumn(name = "paciente_id")
    @ManyToOne
    private Integer paciente;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String observacao;

    private LocalDateTime data;

    public Consulta(DadosAgendamentoConsulta dados) {
        this.medico = dados.medicoId();
        this.paciente = dados.pacienteId();
        this.observacao = dados.observacao();
        this.status = dados.status();
        this.data = dados.data();
    }



}
