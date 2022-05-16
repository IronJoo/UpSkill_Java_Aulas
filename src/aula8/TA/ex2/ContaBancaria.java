package aula8.TA.ex2;

import java.util.Scanner;

public abstract class ContaBancaria {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public ContaBancaria(String senha){
        this.senha = senha;
    }
    public abstract void Levanta(double valor);
    public abstract void Deposita(double valor);
    public abstract double tiraExtrato();

    public void alteraSenha(String novaSenha){
        System.out.print("Insira a senha antiga: ");
        Scanner input = new Scanner(System.in);
        String tentativaSenha = input.nextLine();
        if (tentativaSenha.equals(senha)) { // simbolo == nao funciona com strings?  https://tinyurl.com/3ahse8d3
            senha = novaSenha;
            System.out.println("Senha atualizada!");
        }else{
            System.out.println("Senha incorreta!");
        }

    }
}
