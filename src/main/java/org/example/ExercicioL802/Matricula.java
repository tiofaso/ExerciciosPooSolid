package org.example.ExercicioL802;
public class Matricula {
    private int numeroRandom;
    private int minNum =  1000000;
    private int maxNum = 1000000;

    private int escopoNum = minNum + maxNum;


    public String geraMatricula(){ //Gerador de números de matrícula
        numeroRandom = (int)(Math.random() * escopoNum ) + minNum;
        return  String.valueOf(numeroRandom);
    }


}
