package aula2;

public class ex1 {
    public static int sumMult(int a, int b, int c) {
        return (a + b) * c;
    }

    public static int multSum(int a, int b, int c) {
        return (a * b) + c;
    }

    public static void main(String[] args) {
        System.out.println("Soma dos primeiros dois, multiplicado pelo terceiro = " + sumMult(1, 2, 3));
        System.out.println("Multiplicacao dos primeiros dois, somado pelo terceiro = " + multSum(1, 2, 3));
    }
}
