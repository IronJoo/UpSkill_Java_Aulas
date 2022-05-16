package aula3;

public class ex3 {
    public static void printNumber(int numb){
        switch (numb){
            case (1):
                System.out.println("Um.");
                break;
            case (2):
                System.out.println("Dois.");
                break;
            case (3):
                System.out.println("Tres.");
                break;
            default:
                System.out.println("Nao consigo identificar.");
                break;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        printNumber(n);
    }
}
