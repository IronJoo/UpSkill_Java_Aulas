package aula8.TA.ex3;
//completo

public class Circulo extends Forma{

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float)Math.PI * (float)Math.pow(raio, 2);
    }

    @Override
    public float calcularPerimetro() {
        return (2 * (float)Math.PI) * raio;
    }

    @Override
    public String name() {
        return "Circulo";
    }
}
