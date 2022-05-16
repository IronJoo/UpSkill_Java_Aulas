package aula9.TA.ex1;

public class Aviao extends Veiculo{

    private Pessoa[] lugares = new Pessoa[50];
    private int consumo = 3 * super.getConsumo();

    public Aviao(Pessoa[] lugares, int consumo) {
        this.lugares = lugares;
        this.consumo = consumo;
    }
    public Aviao(){

    }
}
