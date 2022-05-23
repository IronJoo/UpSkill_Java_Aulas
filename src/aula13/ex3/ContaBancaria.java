package aula13.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContaBancaria {
    private ArrayList<Movimento> movimentos = new ArrayList<Movimento>();

    public void novoMovimento(String descricao, double valor){
        Movimento movimento = new Movimento(descricao, valor);
        movimentos.add(movimento);

    }
    public void saveInFile(){
        try{
            PrintWriter printFile = new PrintWriter(new File("src/aula13/ex3/movimentos.txt"));



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (!movimentos.isEmpty()){
            
        }
    }
}
