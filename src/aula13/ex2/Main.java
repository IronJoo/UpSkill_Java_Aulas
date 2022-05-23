package aula13.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insere o teu nome:");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Insere a tua idade:");
        String idade = input.nextLine();

        try{
            PrintWriter writeFile = new PrintWriter(new File("src/aula13/ex2/user_input.txt"));
            writeFile.println("O teu nome e " + nome + "\nTens " + idade + " anos.");
            writeFile.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            Scanner readFile = new Scanner(new File("src/aula13/ex2/user_input.txt"));
            String line = readFile.nextLine();
            System.out.println(line);
            line = readFile.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
