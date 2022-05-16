package aula6.TA.ex3;
//completo

public class TanqueCombustivel {
    private double capacidadeAtual, capacidadeMax;

    public TanqueCombustivel(double capacidadeAtual, double capacidadeMax) {
        this.capacidadeAtual = capacidadeAtual;
        this.capacidadeMax = capacidadeMax;
    }

    public double getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(double capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    @Override
    public String toString() {
        return "TanqueCombustivel{" +
                "capacidadeAtual=" + capacidadeAtual +
                ", capacidadeMax=" + capacidadeMax +
                '}';
    }
}
