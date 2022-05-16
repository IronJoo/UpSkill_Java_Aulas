package aula8.ex3;

public class Aniversario extends CartaoPresente{
    public Aniversario(String destinarario){
        super(destinarario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz aniversario, " + getDestinatario() + "!");
    }
}
