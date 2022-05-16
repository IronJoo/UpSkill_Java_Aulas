package aula8.TA.ex2;
//completo

public class ContaCorrente extends ContaBancaria{
    private int nTransacoes = 0;
    private String senha;
    private int numero;
    private double saldo = 0;

    public ContaCorrente(String senha) {
        super(senha);
    }
    @Override
    public void Levanta(double valor){
        System.out.println("Levantou " + valor + " euros.");
        saldo = saldo - valor;
        nTransacoes++;
    }
    @Override
    public void Deposita(double valor){
        System.out.println("Depositou " + valor + " euros.");
        saldo = saldo + valor;
        nTransacoes++;
    }
    @Override
    public double tiraExtrato(){
        return saldo;
    }
}
