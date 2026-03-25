package com.github.app.model.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Endereco {

    @NotBlank
    private String logradouro;

    @NotBlank
    private String bairro;

    @NotBlank
    private String cep;

    private String complemento;

    @NotBlank
    private String cidade;

    @NotBlank
    private String uf;



    public Endereco(DadosCadastroEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }

}
