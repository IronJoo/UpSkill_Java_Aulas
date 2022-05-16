package aula2;

public class ex3 {
    public static double convertF(double n){
        return (n * 1.8) + 32;
    }

    public static double convertC(double n){
        return (n - 32) * 0.5556;
    }

    public static void main(String[] args) {
        double celsius = 50;
        System.out.printf("%1.2f C to F = %1.2f\n", celsius, convertF(celsius));

        double fahren = 5;
        System.out.printf("%1.2f F to C = %1.2f\n", fahren, convertC(fahren));
    }
}
