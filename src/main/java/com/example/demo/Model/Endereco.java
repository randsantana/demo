package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "endeco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "longadouro", nullable = false, length = 100)
    private String longadouro;

    @Column(name = "numero", nullable = true, length = 100)
    private String numero;
    
    @Column(name = "cep", nullable = false, length = 100)
    private String cep;

    @ManyToOne
    private Pontos_interesse pontos_interesse_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongadouro() {
        return longadouro;
    }

    public void setLongadouro(String longadouro) {
        this.longadouro = longadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pontos_interesse getPontos_interesse_id() {
        return this.pontos_interesse_id;
    }

    public void setPontos_interesse_id(Pontos_interesse pontos_interesse_id) {
        this.pontos_interesse_id = pontos_interesse_id;
    }
}