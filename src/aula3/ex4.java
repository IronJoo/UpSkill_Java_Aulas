package aula3;

import java.util.Scanner;

public class ex4 {
    public static void checkNumber(int n) {
        if (n < 0) {
            System.out.println("Inseriste um numero negativo.\n");
        } else if (n > 0) {
            System.out.println("Inseriste um numero postivo.\n");
        } else {
            System.out.println("Inseriste o numero zero.\n");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insere um numero: ");
            int n = input.nextInt();
            checkNumber(n);
        }
    }
}
