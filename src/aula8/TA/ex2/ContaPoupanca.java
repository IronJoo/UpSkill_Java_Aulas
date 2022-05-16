package aula8.TA.ex2;
//completo

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento = 1.2;
    private String senha;
    private int numero;
    private double saldo = 0;

    public ContaPoupanca(String senha) {
        super(senha);
    }
    @Override
    public void Levanta(double valor){
        System.out.println("Levantou " + valor + " euros.");
        saldo = saldo - valor;
    }
    @Override
    public void Deposita(double valor){
        System.out.println("Depositou " + valor + " euros.");
        saldo = saldo + valor;
    }
    @Override
    public double tiraExtrato(){
        return saldo * taxaRendimento;
    }
}
