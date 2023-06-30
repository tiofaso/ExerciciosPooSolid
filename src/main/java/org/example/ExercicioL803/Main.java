package org.example.ExercicioL803;

import java.util.Scanner;

import static org.example.ExercicioL802.Vestibulandos.setVestibulandos;
import static org.example.ExercicioL802.Vestibulandos.removeVestibulandos;
import static org.example.ExercicioL803.Cardapio.getPratos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seja bem-vinde ao restaurante!\n");
        LeitorTeclado teclado = new LeitorTeclado();

        int opcao = teclado.menuTeclado();
        int erro;

        //verificando se digitou valor inválido
        if (opcao < 1 || opcao > 3) {
            erro = 0;
        } else {
            erro = 1;
        }

        while (erro == 0) {
            opcao = teclado.menuErro();
            if (opcao < 1 || opcao > 3) {
                erro = 0;
            } else {
                erro = 1;
            }//Usuário fez escolha correta
        }

        int sair = 0; //flag para sair do looping


        while (sair == 0) {
            //Executando as opções
            switch (opcao) {
                case 1://Adicionar prato
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite o nome do prato");
                    String nome = entrada.nextLine();

                    System.out.println("Digite os ingredientes separados por vírgula");
                    String ingredientes = entrada.nextLine();

                    AdicionarPrato novoPrato = new AdicionarPrato(nome, ingredientes);

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 2://Remover prato
                    if(getPratos().size() != 0){//Existe cardápio
                        MostraPratos exibeListaRemove = new MostraPratos();
                        exibeListaRemove.exibePratos();

                        Scanner entradaremove = new Scanner(System.in);
                        System.out.println("\nDigite o nome do prato");
                        String pratoNome = entradaremove.nextLine();

                        RemovePratos remove = new RemovePratos(pratoNome);
                    }else{
                        System.out.println("-- Cardápio vazio --");
                    }

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 3://Monstrar inscritos
                    MostraPratos exibeLista = new MostraPratos();
                    exibeLista.exibePratos();
                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                default://Caso não escolha nada
                    opcao = teclado.menuTeclado();
            }
        }//fim do while


    }
}
