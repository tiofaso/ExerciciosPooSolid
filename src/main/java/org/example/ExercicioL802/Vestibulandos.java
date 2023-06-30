package org.example.ExercicioL802;

import java.util.ArrayList;
import java.util.List;

public abstract class Vestibulandos {
    //Atributos
    private String nome;
    private String matricula;
    private double nota;
    private static List<String> vestibulandos = new ArrayList<>();


    //Métodos
    public void exibeCandidatos() {
    }

    //Getter & setter especial
    public static List<String> getVestibulandos() {
        return vestibulandos;
    }

    public static void setVestibulandos(String vestibulando) {
        vestibulandos.add(vestibulando);
    }

    public static void removeVestibulandos(int index) {
        vestibulandos.remove(index);
    }

}
