package aula8.ex2;

public class CalculadoraCientifica extends Calculadora{

    public CalculadoraCientifica(){
    }
    public double raizQuadrada(double numero1){
        return Math.sqrt(numero1);
    }
    public double potencia(double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }
}
