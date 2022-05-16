package aula8.ex3;

public class DiaDosNamorados extends CartaoPresente{

    public DiaDosNamorados(String destinarario){
        super(destinarario);
    }
    @Override
    public void showMessage(){
        System.out.println("Feliz dia dos namorados, " + getDestinatario() + "!");
    }
}
