package org.example.ExercicioL802;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import static org.example.ExercicioL802.Vestibulandos.setVestibulandos;

public class VestibulandosArquivo {//Lê um arquivo com vestibulandos e joga numa lista
    private String caminhoCompleto;
    private String filePath;
    private String dadosArquivos;

    public void listaVestibulandosFixa() {

        caminhoCompleto = System.getProperty("user.dir");
        filePath = caminhoCompleto + "/src/main/java/org/example/ExercicioL802" + "/vestibulandos.csv"; //Caminho do arquivo

        //Lendo o arquivo
        try{
            File theFileRead = new File(filePath);
            Scanner leitor = new Scanner(theFileRead);

            while (leitor.hasNextLine()){
                dadosArquivos = leitor.nextLine();
                setVestibulandos(dadosArquivos);
                //System.out.println(dadosArquivos);
            }

            leitor.close();
        }catch(FileNotFoundException error){error.printStackTrace();}
    }
}
