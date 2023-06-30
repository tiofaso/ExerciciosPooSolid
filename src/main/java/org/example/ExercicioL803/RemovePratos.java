package org.example.ExercicioL803;

public class RemovePratos extends Cardapio {
    private String[] listaTemp;
    private int index;
    private int cont;
    public RemovePratos(String nome) {
        if(getPratos().size() == 0){//Não há nada no cardápio
            System.out.println("-- Cardápio vazio --");
        }else {
            cont = 0;

            for (String lista : getPratos()) {
                listaTemp = lista.split(";", 3);

                if (listaTemp[0] == nome) {
                    index = cont;
                }
                cont++;
            }

            removePratos(index);

            System.out.println("Prato removido!");
        }
    }
}
