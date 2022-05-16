package aula9.TA.ex1;

public class Autocarro extends Veiculo{
    private Pessoa[] lugares = new Pessoa[50];
    //private int consumo = super.getConsumo();

    private int countLugares(){
       int count = 0;
       for (int i = 0; i < lugares.length; i++){
           if (!this.lugares[i].getName().equals(null)){
               count++;
           }
       }
       System.out.println("Numero de lugares: " + count);
       return count;
    }

    @Override
    public int getConsumo() {
        if (countLugares() > lugares.length/2){
            return super.getConsumo() * 2;
        }
        return super.getConsumo();
    }
}
