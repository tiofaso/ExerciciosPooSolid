package org.example.ExercicioL801;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.printf("Bem-vinde ao controle de estoque!\n\n");
        LeitorTeclado teclado = new LeitorTeclado();

        int escolheOpcao = teclado.menuTeclado();

        if(escolheOpcao < 1 && escolheOpcao > 3){
            while (escolheOpcao < 1 && escolheOpcao > 3){
                escolheOpcao = teclado.menuErro();
            }
        }


        //Criando objeto
        ManipulaEstoque produto = new ManipulaEstoque();

        int sair = 0; //Flag para sair do programa


        while (sair == 0){
            Scanner produtos = new Scanner(System.in);
            switch (escolheOpcao){
                case 1: //Adicionar produto
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = produtos.nextLine();
                    produto.setNomeProduto(nomeProduto);

                    System.out.println("Digite o preço do produto:");
                    double precoProduto = produtos.nextDouble();
                    produto.setPrecoProduto(precoProduto);



                    produto.adicionaProduto();

                    sair = teclado.menuSair();
                    escolheOpcao = 0;
                    break;
                case 2: //Remover produto
                    if(produto.tamanhoEstoque()!= 0) {

                        System.out.println("Digite o código do produto (ele vem antes do nome):\n");

                        System.out.println("------");
                        produto.mostraProduto();
                        System.out.println("------");

                        int codigoProduto = produtos.nextInt();
                        produto.removeProduto(codigoProduto);


                        System.out.println("------");
                        produto.mostraProduto();
                        System.out.println("------");
                    }else { System.out.println("-- estoque vazio --");}

                    sair = teclado.menuSair();
                    escolheOpcao = 0;
                    break;
                case 3://Mostrar produto
                    produto.mostraProduto();
                    sair = teclado.menuSair();
                    escolheOpcao = 0;
                    break;
                default:
                    escolheOpcao = teclado.menuTeclado();

            }//Fim switch

        }//Fim do while
    }//Fim Static
}//Fim main
