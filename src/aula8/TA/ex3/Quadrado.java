package aula8.TA.ex3;
//completo

public class Quadrado extends Rectangulo{

    public Quadrado(float lado) {
        super(lado, lado);
    }
    @Override
    public String name() {
        return "Quadrado";
    }
}
