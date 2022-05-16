package aula6;
//completo
public class ex4 {
    public static void main(String[] args) {
        Room room1 = new Room(15, 1, 'A');
        Student student1 = new Student(1,"Joana Ferro","Java");
        Student student2 = new Student(2,"João Silva","Java");
        Student student3 = new Student(3,"Susana Nascimento","Java");
        room1.addStudent(student1);
        System.out.println("--Adding students with IDs: \n" + student1.getID());
        room1.addStudent(student2);
        System.out.println(student2.getID());
        room1.addStudent(student3);
        System.out.println(student3.getID());
        System.out.println("--Printing students list");
        room1.listStudents();
        Student student4 = new Student(4,"Mariana Andrade","Java");
        System.out.println("--New student added.");
        room1.addStudent(student4);
        room1.listStudents();
    }
}
