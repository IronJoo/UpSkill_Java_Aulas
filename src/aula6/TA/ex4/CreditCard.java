package aula6.TA.ex4;

public class CreditCard {
    private final long numeroCard;
    private String titular;
    private int mes, ano;
    private double maxDebit, gastoAtual;
    private String[] historico;

    public CreditCard(long numeroCard, String titular,
                      int mes, int ano, double maxDebit) {
        this.numeroCard = numeroCard;
        this.titular = titular;
        this.mes = mes;
        this.ano = ano;
        this.maxDebit = maxDebit;
        this.gastoAtual = 0;
    }
    public double saldo(){
        return maxDebit - gastoAtual;
    }
    public void pagarCredito(int pag){
        gastoAtual -= pag;
    }
    void gastar(int quantia, String descr){
        if (gastoAtual + quantia <= maxDebit){
            gastoAtual += quantia;

        }else{
            System.out.println("Excedeu saldo.");
        }
    }
}
