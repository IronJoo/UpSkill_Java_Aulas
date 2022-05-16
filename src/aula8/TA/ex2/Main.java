package aula8.TA.ex2;
//completo

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("12345");
        ContaBancaria conta2 = new ContaPoupanca("54321");

        conta1.Deposita(1500);
        conta2.Deposita(6000);
        System.out.println("Extrato conta 1: " + conta1.tiraExtrato());
        System.out.println("Extrato conta 2: " + conta2.tiraExtrato());
        conta1.Levanta(5);
        conta1.Levanta(5);
        System.out.println("Extrato conta 1: " + conta1.tiraExtrato());
        conta1.alteraSenha("1");
    }
}
