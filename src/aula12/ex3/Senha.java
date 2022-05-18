package aula12.ex3;

public class Senha implements Comparable<Senha>{
    private int numero;
    private String nome;
    private int NIF;

    public Senha(int numero, String nome, int NIF) {
        this.numero = numero;
        this.nome = nome;
        this.NIF = NIF;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Senha senha){
        if (numero == senha.getNumero()){
            return 0;
        }else if (numero < senha.getNumero()){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Senha{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", NIF=" + NIF +
                '}';
    }
}
