package aula6.TA.ex3;
//completo

import aula6.Person;

public class Car {
    private final String marca, modelo, matricula, registo;
    private int nLugares;
    private double consumo;
    TanqueCombustivel tanque;
    private boolean isLigado = false;
    private Person owner;

    public Car(String marca, String modelo, String matricula, String registo, int nLugares, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.registo = registo;
        this.nLugares = nLugares;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

//    public void setMarca(String marca) {
//        this.marca = marca;
//    }

    public String getModelo() {
        return modelo;
    }

//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }

    public String getMatricula() {
        return matricula;
    }

//    public void setMatricula(String matricula) {
//        this.matricula = matricula;
//    }

    public String getRegisto() {
        return registo;
    }

//    public void setRegisto(String registo) {
//        this.registo = registo;
//    }

    public int getnLugares() {
        return nLugares;
    }

    public void setnLugares(int nLugares) {
        this.nLugares = nLugares;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public TanqueCombustivel getTanque() {
        return tanque;
    }

    public void setTanque(TanqueCombustivel tanque) {
        this.tanque = tanque;
    }

    public void setLigado() {
        isLigado =! isLigado;
    }

    public void encherDeposito(int litros){
        if (tanque.getCapacidadeAtual() + litros <= tanque.getCapacidadeMax()){
            tanque.setCapacidadeAtual(tanque.getCapacidadeAtual() + litros);
        }else{
            System.out.println("A quantidade indicada ultrapassa a capacidade do tanque!");
        }
    }
    public void run(double distancia){
        if (isLigado){
            tanque.setCapacidadeAtual(tanque.getCapacidadeAtual() - ((consumo/100) * distancia)); //valor arredonda for some reason???
            System.out.println("Nesta viagem de " + distancia + " kms, o carro consumiu " + ((consumo/100 * distancia)) + "L.");
        }else{
            System.out.println("O carro não está ligado!");
        }

    }
    public void isLigado(){
        System.out.print("O carro encontra-se ");
        if (isLigado){
            System.out.println("ligado.");
        }else{
            System.out.println("desligado.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", registo='" + registo + '\'' +
                ", nLugares=" + nLugares +
                ", consumo=" + consumo +
                ", tanque=" + tanque +
                ", isLigado=" + isLigado +
                ", owner=" + owner +
                '}';
    }
}
