package aula11.ex4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[5];
        livros[0] = new Livro("The Shinning", 1990, "Leya", "Stephen King");
        livros[1] = new Livro("Harry Potter", 2001, "ASA", "JK Rowling");
        livros[2] = new Livro("O Inferno de Dante", 1472, "Bertrand", "Dante");
        livros[3] = new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
        livros[4] = new Livro("Desenhar Bases de Dados", 2016, "Silabo", "Pedro Nogueira");
        System.out.println("--Ordenado por entrada--");
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--Ordenado alfabeticamente--");
        Arrays.sort(livros, new AlfabeticoCompare());
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--Ordenado por ano decrescente--");
        Arrays.sort(livros, new AnoDecrescenteCompare());
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }

        System.out.println("--Ordenado Editora--");
        Arrays.sort(livros, new EditoraAlfabeticoCompare());
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }
    }

}
