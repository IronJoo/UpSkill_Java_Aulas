package aula6;
public class Student {
    private int ID;
    private String name;
    private String course;

    public Student(int ID, String name, String course){
        this.ID = ID;
        this.name = name;
        this.course = course;
    }

    public int getID() {
        return ID;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
