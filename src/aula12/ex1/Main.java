package aula12.ex1;

import java.util.ArrayList;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contacto joao = new Contacto("Joao Silva", 910000000, "joao.silva@gmail.com");
        Contacto pedro = new Contacto("Pedro Fernandes", 910000001, "pedro.fernandes@gmail.com");
        Contacto maria = new Contacto("Maria Rita", 910000002, "maria.ritinha@gmail.com");

        ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(joao);
        contactos.add(pedro);
        contactos.add(maria);
        contactos.add(new Contacto("Joana Ferro", 963161999, "joanaferro92@gmail.com"));

        System.out.println("List size = " + contactos.size());
        System.out.println("--Running a foreach loop--");
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }

        contactos.remove(2);
        System.out.println("--Removido elemento index [2]--");
        System.out.println("List size = " + contactos.size());
        System.out.println("--Running a for loop--");
        for (int i = 0; i < contactos.size(); i++){
            System.out.println(contactos.get(i));
        }
    }
}
