package aula11.ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[4];

        filmes[0] = new Filme("Force Awakens", 8, 2015);
        filmes[1] = new Filme("Star Wars", 9, 1977);
        filmes[2] = new Filme("Empire Strikes Back", 7, 1980);
        filmes[3] = new Filme("Return of the Jedi", 10, 1983);

        for (int i = 0; i < filmes.length; i++) {
            System.out.println(filmes[i]);
        }
        System.out.println("---");
        Arrays.sort(filmes);
        for (int i = 0; i < filmes.length; i++) {
            System.out.println(filmes[i]);
        }
    }
}
