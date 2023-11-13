package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "cidade")
@Table(name = "cidade")
@Data
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cidade;
    private String descricao;
    private String uf;
    private String codigo_ibge;
    private String ddd;
}
