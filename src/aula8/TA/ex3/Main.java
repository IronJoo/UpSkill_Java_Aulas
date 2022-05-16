package aula8.TA.ex3;
//completo

public class Main {
    public static void main(String[] args) {
        Forma rectangulo1 = new Rectangulo(5,10);

        Forma circulo1 = new Circulo(5);

        Forma quadrado1 = new Quadrado(5);


        Forma[] listaFormas = new Forma[5];
        listaFormas[0] = rectangulo1;
        listaFormas[1] = circulo1;
        listaFormas[2] = quadrado1;

        for (int i = 0; i < listaFormas.length; i++){
            if (listaFormas[i] != null){
                System.out.println("Perimetro do " + listaFormas[i].name() + " = " + listaFormas[i].calcularPerimetro());
                System.out.println("Area do " + listaFormas[i].name() + " = " + listaFormas[i].calcularArea());
            }
        }
    }
}
