package aula6;
//completo
public class Room {
    private int capacity, number;
    private char block;
    private Student[] studentList;

    public Room(int capacity, int number, char block){
        this.capacity = capacity;
        this.number = number;
        this.block = block;
        studentList = new Student[capacity];
    }


    public void addStudent(Student student){
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i] == null){
                studentList[i] = student;
                break;
            }
        }
    }
    public void removeStudent(Student student){
        for (int i = 0; i < studentList.length; i++){
            if (studentList != null){
                if (studentList[i].getID() == student.getID()){
                    studentList[i] = null;
                    break;
                }
            }
        }
    }
    public void listStudents(){
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i] != null){
                System.out.println(studentList[i].getName());
            }
        }
    }
}
