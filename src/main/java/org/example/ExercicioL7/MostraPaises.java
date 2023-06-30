package org.example.ExercicioL7;

public class MostraPaises extends Paises {
    private String[] paisesTemp;
    private String paisesArrumado;
    private int index;

    public void exibePaises() {

        if (getPaises().size() == 0) {//Nunca foi criada lista
            PaisesArquivo paisesArquivo = new PaisesArquivo();
            paisesArquivo.listaPaisesFixa();

            index = 0;

            for (String lista : getPaises()) {
                paisesTemp = lista.split(";", 6);
                paisesArrumado = index + " " + paisesTemp[0] + " " + paisesTemp[1] + " " + paisesTemp[2] + " " + paisesTemp[3] + " " + paisesTemp[4] + " " + paisesTemp[5];
                System.out.println(paisesArrumado);
                index++;
            }
        } else {//Já foi criada lista
            for (String lista : getPaises()) {
                paisesTemp = lista.split(";", 3);
                paisesArrumado = index + " " + paisesTemp[0] + " " + paisesTemp[1] + " " + paisesTemp[2] + " " + paisesTemp[3] + " " + paisesTemp[4] + " " + paisesTemp[5];
                System.out.println(paisesArrumado);
                index++;
            }

        }

    }
}
