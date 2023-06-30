package org.example.ExercicioL803;

public class AdicionarPrato extends Cardapio {
    //Atributos
    private String novoPrato;

    //Construtor
    public AdicionarPrato(String nome, String ingredientes) {
        novoPrato = nome + ";" + ingredientes;
        setPratos(novoPrato);
        System.out.println("Prato adicionado ao menu!");
    }


}
