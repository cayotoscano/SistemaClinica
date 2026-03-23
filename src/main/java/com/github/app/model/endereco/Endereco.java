package com.github.app.model.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String cidade;
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
