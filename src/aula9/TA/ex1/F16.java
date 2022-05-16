package aula9.TA.ex1;

public class F16 extends Veiculo{
    private Pessoa[] lugares = new Pessoa[20];
    private int consumo = 3 * super.getConsumo();
    boolean emMissaoResgate = false;

    public F16() {
    }

    public boolean isEmMissaoResgate() {
        return emMissaoResgate;
    }

    public void setEmMissaoResgate(boolean emMissaoResgate) {
        this.emMissaoResgate = emMissaoResgate;
        consumo = super.getConsumo() * 4;
    }
}
