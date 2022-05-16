package aula3;

import java.util.Scanner;

public class ex5 {
    public static int checkBiggest(int a, int b, int c){
        if (a > b){
            if (a > c){
                return a;
            }
            else if (c > a){
                return c;
            }
        }else if (b > a){
            if (b > c){
                return b;
            }
            else if (c > b){
                return c;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Insere o primeiro numero: ");
            int a = input.nextInt();
            System.out.print("Insere o primeiro numero: ");
            int b = input.nextInt();
            System.out.print("Insere o primeiro numero: ");
            int c = input.nextInt();
            System.out.println("O numero maior e " + checkBiggest(a, b, c) + ".\n");
        }
    }
}
