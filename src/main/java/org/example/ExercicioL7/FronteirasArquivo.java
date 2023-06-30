package org.example.ExercicioL7;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import static org.example.ExercicioL7.Paises.setFronteiras;

public class FronteirasArquivo {//Lê um arquivo com fronteiras e joga numa lista
    private String caminhoCompleto;
    private String filePath;
    private String dadosArquivos;

    public void listaFronteirasFixa() {

        caminhoCompleto = System.getProperty("user.dir");
        filePath = caminhoCompleto + "/src/main/java/org/example/ExercicioL7" + "/fronteiras.csv"; //Caminho do arquivo

        //Lendo o arquivo
        try{
            File theFileRead = new File(filePath);
            Scanner leitorFronteira = new Scanner(theFileRead);

            while (leitorFronteira.hasNextLine()){
                dadosArquivos = leitorFronteira.nextLine();
                setFronteiras(dadosArquivos);
                //System.out.println(dadosArquivos);
            }

            leitorFronteira.close();
        }catch(FileNotFoundException error){error.printStackTrace();}
    }
}
