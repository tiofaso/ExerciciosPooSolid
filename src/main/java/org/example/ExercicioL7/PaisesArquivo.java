package org.example.ExercicioL7;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import static org.example.ExercicioL7.Paises.setPaises;

public class PaisesArquivo {//Lê um arquivo com vestibulandos e joga numa lista
    private String caminhoCompleto;
    private String filePath;
    private String dadosArquivos;

    public void listaPaisesFixa() {

        caminhoCompleto = System.getProperty("user.dir");
        filePath = caminhoCompleto + "/src/main/java/org/example/ExercicioL7" + "/iso3166.csv"; //Caminho do arquivo
        System.out.println(filePath);

        //Lendo o arquivo
        try{
            File theFileRead = new File(filePath);
            Scanner leitor = new Scanner(theFileRead);

            while (leitor.hasNextLine()){
                dadosArquivos = leitor.nextLine();
                setPaises(dadosArquivos);
                //System.out.println(dadosArquivos);
            }

            leitor.close();
        }catch(FileNotFoundException error){error.printStackTrace();}
    }
}
