package aula3;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Qual e o teu nome?: ");
        String name = keyboard.nextLine();

        System.out.print("Qual e a tua idade?: ");
        int age = keyboard.nextInt();

        System.out.println("Ola " + name + ", tens " + age + " anos!");
    }

}
