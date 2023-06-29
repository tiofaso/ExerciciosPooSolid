package org.example.ExercicioL802;

import java.math.BigInteger;

public abstract class Candidatos {
    //Atributos
    private String nome;
    private BigInteger numeroMatricula;
    private double nota;

    //métodos
    public void adicionarCandidato(){}
    public void removerCandidato(){}
    public void exibirCandidato(){}

    //getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(BigInteger numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
