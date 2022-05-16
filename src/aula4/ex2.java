package aula4;

public class ex2 {

    public static boolean checkNumber(int n, int[] a){
        for (int i = 0; i < a.length; i++){
            if (a[i] == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {1, 6, 8, 2, 9};
        System.out.println(checkNumber(3, a));
    }
}
