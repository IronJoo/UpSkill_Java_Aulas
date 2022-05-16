package aula6;
public class ex1 {
    public static void main(String[] args) {
        Person person1 = new Person("Joana", "Santos", 29);
        person1.setLastName("Ferro");
        person1.setAddress("Rua da Ilha de Sao Tome 17, Lisboa");
        person1.setNationality("portuguesa");
        System.out.println(person1.toString());
    }
}
