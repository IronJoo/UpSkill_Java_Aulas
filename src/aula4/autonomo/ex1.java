package aula4.autonomo;

public class ex1 {
    public static int sumAll(){
        int i = 0;
        int sum = 0;
        while (i < 100){
            sum = sum + i;
            i++;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sumAll());
    }
}
