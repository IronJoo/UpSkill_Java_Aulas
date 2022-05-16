package aula9.TA.ex1;

public abstract class Veiculo {
    private Pessoa[] lugares = new Pessoa[100];
    private int consumo;

    public Veiculo(){
        lugares = new Pessoa[100];
        consumo = 5;
    }
    public void adicionarPassageiro(Pessoa nome){
        for (int i = 0; i < lugares.length; i++){
            if (lugares[i] == null){
                lugares[i] = nome;
                break;
            }
        }
    }
    public void removerPassageiro(Pessoa nome){
        for (int i = 0; i < lugares.length; i++){
            if (lugares[i].getName() == nome.getName()){
                lugares[i] = null;
                break;
            }
        }
    }
    public void listarPassageiros(){
        for (int i = 0; i < lugares.length; i++){
            if (lugares[i] != null){
                System.out.println(lugares[i].getName());
            }
        }
    }

    public Pessoa[] getLugares() {
        return lugares;
    }

    public void setLugares(Pessoa[] lugares) {
        this.lugares = lugares;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}
