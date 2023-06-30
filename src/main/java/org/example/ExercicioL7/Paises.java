package org.example.ExercicioL7;

import java.util.ArrayList;
import java.util.List;

public abstract class Paises {
    //Atributos
    private String nome;
    private String matricula;
    private double nota;
    private static List<String> paises = new ArrayList<>();

    private static List<String> fronteiras = new ArrayList<>();


    //Getter & setter especial
    public static List<String> getPaises() {
        return paises;
    }

    public static void setPaises(String iso) {
        paises.add(iso);
    }

    public static List<String> getFronteiras() {return fronteiras;}

    public static void setFronteiras(String iso) {
        fronteiras.add(iso);
    }


}
