package org.example.ExercicioL802;

public class RemoveCandidato extends Vestibulandos {
    private String[] listaTemp;
    private int index;
    private int cont;
    public RemoveCandidato(String matricula) {



        cont = 0;

        for (String lista : getVestibulandos()) {
            listaTemp = lista.split(";",3);

            if(listaTemp[0] == matricula){index = cont;}
            cont++;
        }

        removeVestibulandos(index);

        System.out.println("Candidato removido!");
    }
}
