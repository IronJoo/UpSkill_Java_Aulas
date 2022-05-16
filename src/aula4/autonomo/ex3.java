package aula4.autonomo;

public class ex3 {
    public static int countDivisors(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 30;
        System.out.println(countDivisors(n));
    }
}
