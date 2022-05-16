package aula3;

public class ex2 {
    public static void getTemperature(int temp){
        if (temp < 0){
            System.out.println("Esta gelado.");
        }else if (temp < 15){
            System.out.println("Esta frio.");
        }else if (temp > 50 && temp <= 80){
            System.out.println("Esta quente.");
        }else if (temp > 80){
            System.out.println("Esta a ferver.");
        }else{
            System.out.println("Esta normal.");
        }
    }

    public static void main(String[] args) {
        int temp = 80;
        getTemperature(temp);
    }
}
