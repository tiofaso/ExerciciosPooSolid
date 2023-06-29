package org.example.ExercicioL802;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        String[] testado;
        Matricula teste = new Matricula();
//
//        for(int i=0; i<10;i++){
//            testado[i] = teste.geraMatricula();
//            System.out.println(testado[i]);
//        }

        Estatico.addVestibulandos("Fabio");
        Estatico.addVestibulandos("Fernando");

        for (String vestibulando : Estatico.getVestibulandos()) {
            System.out.println(vestibulando);
        }
    }
}
