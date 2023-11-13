package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "logradouro")
@Table(name = "logradouro")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Logradouro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_logradouro;

    private String cep;
    private String tipo;
    private String descricao;
    private String uf;
    private String complemento;
    private String descricao_sem_numero;
    private String descricao_cidade;
    private String codigo_cidade_ibge;
    private String descricao_bairro;
}
