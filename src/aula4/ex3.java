package aula4;

public class ex3 {
    public static int checkMaxNumber(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static int checkMinNumber(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a[] = {2, 2, 8, 2, 3};
        System.out.println("Max value is = " + checkMaxNumber(a));
        System.out.println("Min value is = " + checkMinNumber(a));
    }
}
