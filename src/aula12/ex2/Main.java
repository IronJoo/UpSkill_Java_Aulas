package aula12.ex2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Carro opel = new Carro("74-72-OP", "Opel", 1998);
        Carro mercedes = new Carro("96-AC-14", "Mercedes", 2020);
        Carro seat = new Carro("35-73-FD", "Seat", 2001);

        System.out.println("--Initializing HashMap from String key (Object attribute)");
        Map<String,Carro> mapaCarros = new HashMap<String, Carro>();
        mapaCarros.put(opel.getMatricula(), opel);
        mapaCarros.put(mercedes.getMatricula(), mercedes);
        mapaCarros.put(seat.getMatricula(), seat);
        System.out.println("--Objects Carro created and added to Hash Map with key Matricula");
        String matricula = "96-AC-14";
        Carro c = mapaCarros.get(matricula);

        System.out.println("--Retrieving object from matricula:\n" + c);

        System.out.println("\n--Initializing HashMap from Integer key (Non-object attribute)");
        Map<Integer,Carro> mapaCarros2 = new HashMap<Integer, Carro>();
        mapaCarros2.put(1, opel);
        mapaCarros2.put(2, mercedes);
        mapaCarros2.put(3, seat);
        System.out.println("--Objects created and added to Hash Map");
        mapaCarros2.remove(2);
        int num = 2;
        Carro d = mapaCarros2.get(num);
        System.out.println("Retrieving object from index:\n" + d); //null

        System.out.println("--Creating list from Map values");
        for(Carro carro : mapaCarros2.values()){
            System.out.println(carro);
        }
        System.out.println("--Printing values from mapaCarros2.values():\n" + mapaCarros2.values());



    }
}
