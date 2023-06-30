package org.example.ExercicioL802;

public class AdicionarCandidato extends Vestibulandos {
    //Atributos
    private String novoCandidato;

    //Construtor
    public AdicionarCandidato(String matricula, String nome, double nota) {
        novoCandidato = matricula + ";" + nome + ";" + nota;
        setVestibulandos(novoCandidato);
        System.out.println("Candidado adicionado!");
    }


}
