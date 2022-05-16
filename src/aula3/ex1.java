package aula3;

public class ex1 {

    public static int round(double n){
        int cpy = (int) n;

        n = n - cpy;
        if (n < 0.5){
            return cpy;
        }
        else {
            return cpy + 1;
        }
    }

    public static void main(String[] args) {
        double n = 6.71;

        System.out.println(round(n));
    }
}
