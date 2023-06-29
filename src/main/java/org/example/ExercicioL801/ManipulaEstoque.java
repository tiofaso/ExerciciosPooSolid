package org.example.ExercicioL801;

public class ManipulaEstoque extends Estoque { //Adiciona produtos ao estoque
    private String produtoFinal;
    private int tamanhoEstoque;
    private String[] produtoTemporario;
    private int produtoIndex;

    public void adicionaProduto() {
        produtoFinal = getNomeProduto() + ";" + String.valueOf(getPrecoProduto());
        produtos.add(produtoFinal);
        System.out.printf(">> Produto adicionado!\n\n");
    }

    public void mostraProduto() {
        tamanhoEstoque = produtos.size();

        if(tamanhoEstoque != 0) {
            for (int i = 0; i < tamanhoEstoque; i++) {
                produtoTemporario = produtos.get(i).split(";", 2);
                produtoFinal = i + " " + produtoTemporario[0] + " R$" + produtoTemporario[1];
                System.out.printf(produtoFinal + "\n");
            }
        }else{
            System.out.println("-- estoque vazio --");
        }
    }

    public void removeProduto(int index) {
        tamanhoEstoque = produtos.size();

        if(tamanhoEstoque != 0) {
            produtos.remove(index);
            System.out.println(">> Produto removido!");
        }else{
            System.out.println("-- estoque vazio --");

        }


    }

    public int tamanhoEstoque(){
        return tamanhoEstoque = produtos.size();
    }
}
