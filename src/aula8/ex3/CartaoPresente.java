package aula8.ex3;

public abstract class CartaoPresente {
    private String destinatario;

    public CartaoPresente(String destinarario){
        this.destinatario = destinarario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public abstract void showMessage();
}
