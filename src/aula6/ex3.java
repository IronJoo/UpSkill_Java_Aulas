package aula6;
//completo

public class ex3 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 6);
        System.out.println("Area = " + rectangle1.area());
        System.out.println("Perimeter = " + rectangle1.perimeter());
        System.out.println("Diagonal Size = " + rectangle1.diagonalSize());
        System.out.println("Square? = " + rectangle1.isSquare());
    }
}
