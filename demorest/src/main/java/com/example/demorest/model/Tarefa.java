package com.example.demorest.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String responsavel;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrega;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", nome=" + nome + ", responsavel=" + responsavel + ", dataEntrega=" + dataEntrega + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, responsavel, dataEntrega);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        return Objects.equals(id, other.id) &&
               Objects.equals(nome, other.nome) &&
               Objects.equals(responsavel, other.responsavel) &&
               Objects.equals(dataEntrega, other.dataEntrega);
    }
}


