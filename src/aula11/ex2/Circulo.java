package aula11.ex2;

public class Circulo implements FiguraGeometricaPlana{
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public int getArea() {
        return (int)(Math.PI * Math.pow(raio, 2));
    }

    @Override
    public int getPerimetro() {
        return (int)((2*Math.PI)*raio);
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Circulo";
    }
}
