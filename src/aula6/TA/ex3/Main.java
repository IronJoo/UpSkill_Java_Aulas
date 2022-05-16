package aula6.TA.ex3;
//completo

import aula6.Person;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Corsa", "76-OP-74", "05/25", 2, 5);
        TanqueCombustivel tanque1 = new TanqueCombustivel(25, 50);
        car1.setTanque(tanque1);
        System.out.println("--Tanque\nCapacidade atual: " + tanque1.getCapacidadeAtual() + "\nCapacidade máxima: " + tanque1.getCapacidadeMax());
        car1.encherDeposito(5);
        System.out.println("Nova capacidade atual: " + tanque1.getCapacidadeAtual());
        car1.run(3);
        car1.isLigado();
        car1.setLigado();
        car1.isLigado();
        car1.run(1);
        System.out.println("Nova capacidade atual: " + tanque1.getCapacidadeAtual());
        Person person1 = new Person("Joana", "Ferro", 29);
        car1.setOwner(person1);
        System.out.println("New car owner: " + car1.getOwner());
        System.out.println(car1);
    }
}
