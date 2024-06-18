package com.example.demo.Model;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
}

    //@Column(name = "cpf", nullable = false, length = 14)
   // private String cpf;

    //@Column(name = "email", nullable = false)
    //private String email;

    //@Column(name = "telofone", nullable = false, length = 11)
    //private String telofone;

    //@Column(name = "nome_responsavel", nullable = false, length = 11)
    //private String nome_responsavel;

    //@Column(name = "aprovado", nullable = false, length = 11)
    //private String aprovado;

    //@Column(name = "data_nascimento", nullable = false, length = 11)
    //private String data_nascimento;

    //@Column(name = "grau", nullable = false, length = 11)
    //private String grau;

    //@ManyToMany
    //private List<Deficiencia> deficiencias;

    //@ManyToOne
    //@JoinColumn(name = "endereco_id")
    //private Endereco endereco;

    

