//package aula9.TA.ex1;
//
//public class F16 extends Veiculo{
//    //private Pessoa[] lugares = new Pessoa[20];
//    //private int consumo = 3 * super.getConsumo();
//    boolean emMissaoResgate = false;
//
//    public F16() {
//        super(new Pessoa[20], super.getConsumo()); //???
//    }
//    public F16(){
//        lugares = new Pessoa[20];
//        super.setConsumo(5);
//    }
//
//    @Override
//    public int getConsumo() {
//        if (emMissaoResgate){
//            return super.getConsumo() * 4;
//        }
//        return (super.getConsumo() * 3);
//    }
//
//    public boolean isEmMissaoResgate() {
//        return emMissaoResgate;
//    }
//
//    public void setEmMissaoResgate() {
//        emMissaoResgate =! emMissaoResgate;
//    }
//}
