package aula4.autonomo;

public class ex2 {
    public static int sumAll(){
        int sum = 0;
        for (int i = 0; i < 100; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumAll());
    }
}
