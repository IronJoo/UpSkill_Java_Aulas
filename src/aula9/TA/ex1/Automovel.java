package aula9.TA.ex1;

public class Automovel extends Veiculo{

    private Pessoa[] lugares = new Pessoa[5];
    private int consumo = super.getConsumo();

    public Automovel(Pessoa[] lugares, int consumo) {
        super(lugares, consumo);
    }
    public Automovel(){

    }
}
