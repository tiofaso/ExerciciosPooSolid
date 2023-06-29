package org.example.ExercicioL801;

import java.util.Scanner;

public class LeitorTeclado {
    private int valorDigitado;
    public int menuTeclado(){
        System.out.printf("Selecione abaixo uma opção:\n");
        System.out.println("1 - Adicionar produto ao estoque");
        System.out.println("2 - Remover produto do estoque");
        System.out.println("3 - Mostrar estoque");

        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();
        return valorDigitado;

    }

    public int menuSair(){
        System.out.println("Deseja sair do programa? [0 - Não | 1 - Sim]");
        Scanner entrada = new Scanner(System.in);
        int sair = entrada.nextInt();
        return sair;
    }

    public int menuErro(){
        System.out.println("> AVISO! - É preciso escolher uma opção!\n");
        System.out.println("1 - Adicionar produto ao estoque");
        System.out.println("2 - Remover produto do estoque");
        System.out.println("3 - Mostrar estoque");
        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();

        return valorDigitado;
    }
}
