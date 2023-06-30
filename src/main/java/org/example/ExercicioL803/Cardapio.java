package org.example.ExercicioL803;

import java.util.ArrayList;
import java.util.List;

public abstract class Cardapio {
    //Atributos
    private String nome;
    private String ingredientes;
    private static List<String> pratos = new ArrayList<>();


    //Métodos
    public void exibePratos() {
    }

    //Getter & setter especial
    public static List<String> getPratos() {
        return pratos;
    }

    public static void setPratos(String vestibulando) {
        pratos.add(vestibulando);
    }

    public static void removePratos(int index) {
        pratos.remove(index);
    }

}
