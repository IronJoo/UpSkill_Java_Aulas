package aula8.ex3;

public class Natal extends CartaoPresente{
    public Natal(String destinarario){
        super(destinarario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz natal, " + getDestinatario() + "!");
    }
}
