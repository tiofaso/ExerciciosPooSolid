package org.example.ExercicioL7;

public class MostraFronteira extends Paises {

    private String[] paisesTemp;
    private String paisesArrumado;
    private int cont;

    public void exibeFronteira(String iso) {
        FronteirasArquivo arquivo = new FronteirasArquivo();
        arquivo.listaFronteirasFixa();

        cont = 2;
        paisesArrumado = "";

        for (String lista : getFronteiras()) {
            paisesTemp = lista.split(";", 12);

            if(paisesTemp[0].equals(iso)){
                System.out.println("ISO 3166: " + paisesTemp[0]);
                System.out.println("País: " + paisesTemp[1]);

                while(cont < 12) {
                    if(paisesTemp[cont] != "") {
                        paisesArrumado = paisesArrumado + paisesTemp[cont] + " ";
                    }
                    cont++;
                }

            }
        }

        System.out.println("Faz fronteira com: " + paisesArrumado);

    }
}
