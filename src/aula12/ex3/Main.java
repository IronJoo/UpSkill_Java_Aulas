package aula12.ex3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Senha senha1 = new Senha(23,"Joana", 236001116);
        Senha senha2 = new Senha(12,"Jose", 289475631);
        Senha senha3 = new Senha(63,"Pedro", 244896671);
        Senha senha4 = new Senha(2, "Joao", 266987511);
        Senha senha5 = new Senha(61,"Ana", 257755987);

        PriorityQueue<Senha> filaSenhas= new PriorityQueue<Senha>();
        filaSenhas.add(senha1);
        filaSenhas.add(senha2);
        filaSenhas.add(senha3);
        filaSenhas.add(senha4);
        filaSenhas.add(senha5);

        System.out.println("-[Printing filaSenhas:]\n" + filaSenhas);
        //System.out.println("-[Printing filaSenhas.peek:]\n" + filaSenhas.peek());
        //System.out.println("[Printing filaSenhas.poll:]\n" + filaSenhas.poll());

        System.out.println(filaSenhas.poll());
        System.out.println(filaSenhas.poll());
        System.out.println(filaSenhas.poll());
        System.out.println(filaSenhas.poll());
        System.out.println(filaSenhas.poll());
        System.out.println("Teste");


    }
}
