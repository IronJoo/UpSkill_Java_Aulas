package aula11.ex4;

import java.util.Comparator;

public class AnoDecrescenteCompare implements Comparator<Livro> {
    public int compare(Livro livro1, Livro livro2){
        if (livro1.getAno() < livro2.getAno()){
            return 1;
        }else if(livro1.getAno() > livro2.getAno()) {
            return -1;
        }else{
            return 0;
        }
    }

}
