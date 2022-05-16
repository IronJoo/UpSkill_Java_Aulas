package aula4;

import java.util.Scanner;

public class ex1 {
    public static void evenWhile(int n){
        System.out.println("Running while loop:");
        int i = 0;
        while (i <= n){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void evenDoWhile(int n){
        System.out.println("\nRunning do-while loop:");
        int i = 0;
        do{
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while (i <= n);
    }
    public static void evenFor(int n){
        System.out.println("\nRunning for loop:");
        for (int i = 2; i <= n; i += 2){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Insert last digit of sequence: ");
        int n = input.nextInt();

        evenWhile(n);
        evenDoWhile(n);
        evenFor(n);
    }
}
