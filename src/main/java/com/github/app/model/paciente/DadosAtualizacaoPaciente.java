package com.github.app.model.paciente;

import com.github.app.model.endereco.DadosCadastroEndereco;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull
        Integer id,
        String nome,
        String email,
        String telefone,
        DadosCadastroEndereco endereco) {
}
