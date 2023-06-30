package org.example.ExercicioL7;
import java.util.Scanner;

public class LeitorTeclado {
    private int valorDigitado;
    public int menuTeclado(){
        System.out.printf("Selecione abaixo uma opção:\n");
        System.out.println("1 - Informações sobre país");
        System.out.println("2 - Densidade populacional");
        System.out.println("3 - Com quem faz fronteira");
        System.out.println("4 - Mostra todos países");

        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();
        return valorDigitado;

    }

    public int menuSair(){
        System.out.println("\nDeseja sair do programa? [0 - Não | 1 - Sim]");
        Scanner entrada = new Scanner(System.in);
        int sair = entrada.nextInt();
        return sair;
    }

    public int menuErro(){
        System.out.println("> AVISO! - É preciso escolher uma opção!\n");
        System.out.println("1 - Informações sobre país");
        System.out.println("2 - Densidade populacional");
        System.out.println("3 - Com quem faz fronteira");
        System.out.println("4 - Mostra todos países");
        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();

        return valorDigitado;
    }
}
