package aula13.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        try {
            PrintWriter ficheiro = criarFicheiro();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
    public static PrintWriter criarFicheiro() throws FileNotFoundException{
        PrintWriter file = new PrintWriter(new File("src/aula13/ex1/pessoas.txt"));
        System.out.println("I'm in");
        file.print("João;23;Lisboa\n" +
                "Maria;10;Porto\n" +
                "Rita;21;Gaia\n" +
                "José;39;Aveiro\n" +
                "Manel;25;Portalegre\n" +
                "Ana;33;Alenquer\n" +
                "Alex;19;Sintra\n" +
                "Jacinto;30;Guarda\n" +
                "Vanderlei;45;Portimão\n");
        file.close();
        return file;
    }
}
