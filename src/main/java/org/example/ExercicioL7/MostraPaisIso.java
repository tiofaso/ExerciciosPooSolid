package org.example.ExercicioL7;

public class MostraPaisIso extends Paises {

    private String[] paisesTemp;
    private String paisesArrumado;
    private int index;

    public void exibePaisesIso(String iso) {
        PaisesArquivo paisessArquivo = new PaisesArquivo();
        paisessArquivo.listaPaisesFixa();

        index = 0;

        for (String lista : getPaises()) {
            paisesTemp = lista.split(";", 6);

            if(paisesTemp[1].equals(iso)){
                paisesArrumado = "País: " + paisesTemp[3] +
                                 "\nISO 3166-2 Alpha 2: " + paisesTemp[0] +
                                 "\nISO 3166-2 Alpha 3: " + paisesTemp[1] +
                                 "\nCódigo numérico: " + paisesTemp[2] +
                                 "\nPopulação: " + paisesTemp[4] +
                                 "\nÁrea (km2): " + paisesTemp[5];

            }


            index++;
        }

        System.out.println(paisesArrumado);

    }
}

