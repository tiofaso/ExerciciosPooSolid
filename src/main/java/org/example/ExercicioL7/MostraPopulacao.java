package org.example.ExercicioL7;

public class MostraPopulacao extends Paises {

    private String[] paisesTemp;
    private String paisesArrumado;
    private int index;
    private int achou;

    public void exibeDensidadePopulacao(String iso) {
        PaisesArquivo paisesArquivo = new PaisesArquivo();
        paisesArquivo.listaPaisesFixa();

        index = 0;

        for (String lista : getPaises()) {
            paisesTemp = lista.split(";", 6);

            if(paisesTemp[1].equals(iso)){
                paisesArrumado = "País: " + paisesTemp[3] +
                        "\nDensidade populacional: " +  paisesTemp[4] +
                        " habitantes";

            }


            index++;
        }

        System.out.println(paisesArrumado);

    }
}

