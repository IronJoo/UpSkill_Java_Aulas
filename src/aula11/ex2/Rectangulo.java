package aula11.ex2;

public class Rectangulo implements FiguraGeometricaPlana{
    int lado;
    int altura;
    private String nome;

    public Rectangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
        if (lado == altura){
            nome = "Quadrado";
        }else{
            nome = "Rectangulo";
        }
    }

    @Override
    public int getArea() {
        return lado * altura;
    }

    @Override
    public int getPerimetro() {
        return lado + lado + altura + altura;
    }

    @Override
    public String getNomeFiguraPlana() {
        return nome;
    }
}
