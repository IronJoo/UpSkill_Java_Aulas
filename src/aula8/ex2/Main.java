package aula8.ex2;

public class Main {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 10;

        Calculadora c = new CalculadoraCientifica();
        System.out.println(c.soma(5,5));
        System.out.println(c.divisao(5,3));
        System.out.println(c.multiplicacao(5,5));
        System.out.println(c.subtracao(5,1));
        CalculadoraCientifica d = new CalculadoraCientifica();
        System.out.println(d.raizQuadrada(5));
        System.out.println(d.potencia(5,2));

    }
}
