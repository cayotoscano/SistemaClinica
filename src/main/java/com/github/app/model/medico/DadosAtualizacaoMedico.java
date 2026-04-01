package com.github.app.model.medico;

import com.github.app.model.endereco.DadosCadastroEndereco;

public record DadosAtualizacaoMedico(Integer id, String nome, String email, DadosCadastroEndereco endereco) {
    
}
