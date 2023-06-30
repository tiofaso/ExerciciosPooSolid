package org.example.ExercicioL7;

import java.math.BigInteger;
import java.util.Scanner;

import static org.example.ExercicioL802.Vestibulandos.setVestibulandos;
import static org.example.ExercicioL802.Vestibulandos.removeVestibulandos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seja bem-vinde a biblioteca ISO 3166!\n");
        LeitorTeclado teclado = new LeitorTeclado();

        int opcao = teclado.menuTeclado();
        int erro;

        //verificando se digitou valor inválido
        if (opcao < 1 || opcao > 4) {
            erro = 0;
        } else {
            erro = 1;
        }

        while (erro == 0) {
            opcao = teclado.menuErro();
            if (opcao < 1 || opcao > 4) {
                erro = 0;
            } else {
                erro = 1;
            }//Usuário fez escolha correta
        }

        int sair = 0; //flag para sair do looping

        Scanner entrada  = new Scanner(System.in);

        while (sair == 0) {
            //Executando as opções
            switch (opcao) {
                case 1://Exibir informações sobre pais
                    System.out.println("Digite as 3 letras do código ISO do país (ex: BRA para Brasil):");
                    String isoPais = entrada.next();
                    MostraPaisIso exibeListaIso = new MostraPaisIso();
                    exibeListaIso.exibePaisesIso(isoPais);

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 2://Mostra densidade populacional
                    System.out.println("Digite as 3 letras do código ISO do país (ex: BRA para Brasil)");
                    System.out.println("para ver sua densidade populacional:");
                    String isoPaisPopulacao = entrada.next();

                    MostraPopulacao exibePopulacao = new MostraPopulacao();
                    exibePopulacao.exibeDensidadePopulacao(isoPaisPopulacao);
                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 3://Mostra vizinhos de fronteira
                    System.out.println("Digite as 3 letras do código ISO do país (ex: BRA para Brasil)");
                    System.out.println("para ver quais países fazem fronteira:");
                    System.out.println("IMPORTANTE! Só está implementada a América do Sul");
                    String isoPaisFronteira = entrada.next();

                    MostraFronteira fronteira = new MostraFronteira();
                    fronteira.exibeFronteira(isoPaisFronteira);

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 4://Mostra todos os países
                    MostraPaises exibeLista = new MostraPaises();
                    exibeLista.exibePaises();

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                default://Caso não escolha nada
                    opcao = teclado.menuTeclado();
            }
        }//fim do while


    }
}
