package aula8.TA.ex3;
//completo

public class Rectangulo extends Forma {
    private float lado;
    private float altura;

    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return lado + lado + altura + altura;
    }
    @Override
    public String name() {
        return "Rectangulo";
    }
}
