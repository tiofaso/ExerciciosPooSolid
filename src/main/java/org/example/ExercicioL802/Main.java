package org.example.ExercicioL802;

import java.math.BigInteger;
import java.util.Scanner;

import static org.example.ExercicioL802.Vestibulandos.setVestibulandos;
import static org.example.ExercicioL802.Vestibulandos.removeVestibulandos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Seja bem-vinde ao sistema do vestibular!\n");
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
                case 1://Adicionar vestibulando
                    Matricula numMatricula = new Matricula();
                    String matricula = numMatricula.geraMatricula();

                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite o nome do vestibulando");
                    String nome = entrada.nextLine();

                    System.out.println("Digite a nota do vestibulando");
                    double nota = entrada.nextDouble();

                    AdicionarCandidato novoCandidato = new AdicionarCandidato(matricula, nome, nota);

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 2://Remover vestibulando
                    MostraCandidatos exibeListaRemove = new MostraCandidatos();
                    exibeListaRemove.exibeCandidatos();

                    Scanner entradaremove = new Scanner(System.in);
                    System.out.println("\nDigite matrícula do candidato:");
                    String matriculaRemove = entradaremove.next();

                    RemoveCandidato remove = new RemoveCandidato(matriculaRemove);

                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                case 3://Monstrar inscritos
                    MostraCandidatos exibeLista = new MostraCandidatos();
                    exibeLista.exibeCandidatos();
                    sair = teclado.menuSair();
                    opcao = 0;
                    break;
                default://Caso não escolha nada
                    opcao = teclado.menuTeclado();
            }
        }//fim do while


    }
}
