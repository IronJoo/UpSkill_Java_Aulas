package aula8.ex3;

public class Main {
    public static void main(String[] args) {
        CartaoPresente jose = new DiaDosNamorados("Jose");
        CartaoPresente joana = new Aniversario("Joana");
        CartaoPresente heather = new Natal("Heather");

        jose.showMessage();
        joana.showMessage();
        heather.showMessage();
    }
}
