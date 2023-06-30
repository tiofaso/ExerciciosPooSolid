package org.example.ExercicioL802;

public class MostraCandidatos extends Vestibulandos {
    private String[] candidatosTemp;
    private String candidatoArrumado;
    private int index;

    public void exibeCandidatos() {

        if (getVestibulandos().size() == 0) {//Nunca foi criada lista
            VestibulandosArquivo vestibulandosArquivo = new VestibulandosArquivo();
            vestibulandosArquivo.listaVestibulandosFixa();

            index = 0;

            for (String lista : getVestibulandos()) {
                candidatosTemp = lista.split(";", 3);
                candidatoArrumado = index + " Matrícula: " + candidatosTemp[0] + " | Nome: " + candidatosTemp[1] + " | Nota: " + candidatosTemp[2] + "pts";
                System.out.println(candidatoArrumado);
                index++;
            }
        } else {//Já foi criada lista
            for (String lista : getVestibulandos()) {
                candidatosTemp = lista.split(";", 3);
                candidatoArrumado = index + " Matrícula: " + candidatosTemp[0] + " | Nome: " + candidatosTemp[1] + " | Nota: " + candidatosTemp[2] + "pts";
                System.out.println(candidatoArrumado);
                index++;
            }

        }

    }
}
