package aula2;

public class ex2 {
    public static double circleArea(int r){
        return Math.PI * Math.pow(r, 2);
    }
//    public static double circleArea2(int r){
//        return Math.PI * r * r;
//    }
    public static double roundOff(double n){
        return Math.round(n*100.0)/100.0;
    }

    public static void main(String[] args) {
        int r = 5;
        System.out.println("Circle area = " + circleArea(r));
        System.out.println("Rounded circle area = " + roundOff(circleArea(r)));
        //System.out.println("Circle area = " + circleArea2(5));
    }
}
