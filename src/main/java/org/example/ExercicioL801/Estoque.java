package org.example.ExercicioL801;

import java.util.ArrayList;
import java.util.List;

public abstract class Estoque {
    //Atributos
    private String nomeProduto;
    private Double precoProduto;
    private int indexProduto;

    //Lista de produtos
    protected List<String> produtos = new ArrayList<String>();

    //Construtor
    public Estoque(){}

    //Métodos
    public void adicionaProduto(){}
    public void removeProduto(int index){}
    public void mostraProduto(){}


    //Getters and setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getIndexProduto() {
        return indexProduto;
    }

    public void setIndexProduto(int indexProduto) {
        this.indexProduto = indexProduto;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
}
