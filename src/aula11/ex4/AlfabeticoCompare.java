package aula11.ex4;

import java.util.Comparator;

public class AlfabeticoCompare implements Comparator<Livro> {
    public int compare(Livro livro1, Livro livro2){
        return livro1.getNome().compareTo(livro2.getNome());
        }
    }

