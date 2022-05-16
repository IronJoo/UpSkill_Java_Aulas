package aula8.ex2;

public abstract class Calculadora {

    public double soma(double numero1, double numero2){
        return numero1 + numero2;
    }
    public double subtracao(double numero1, double numero2){
        return numero1 - numero2;
    }
    public double divisao(double numero1, double numero2){
        return numero1 / numero2;
    }
    public double multiplicacao(double numero1, double numero2){
        return numero1 * numero2;
    }
}
