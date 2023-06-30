package org.example.ExercicioL803;

public class MostraPratos extends Cardapio {
    private String[] pratoTemp;
    private String pratoArrumado;
    private int index;

    public void exibePratos() {
        if(getPratos().size() == 0){//Não há nada no cardápio
            System.out.println("-- Cardápio vazio --");
        }else {
            for (String lista : getPratos()) {
                pratoTemp = lista.split(";", 2);
                pratoArrumado = index + " Prato: " + pratoTemp[0] + " | Ingredientes: " + pratoTemp[1];
                System.out.println(pratoArrumado);
                index++;
            }
        }
    }
}
