package aula5.ex1;

public class main {
    public static void main(String[] args) {
        //SubArray
        System.out.println("--Running: SubArray--");
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        a = ArrayFunctions.subArray(1, 5, a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            if (i != a.length - 1){
                System.out.print(", "); //imprime virgula excepto depois de ultimo elemento do array
            }else{
                System.out.printf("\n");
            }
        }
        //firstHalf
        System.out.println("--Running: firstHalf--");
        int[] b = {0, 1, 2, 3, 4, 5, 6};
        b = ArrayFunctions.firstHalf(b, true);
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]);
            if (i != b.length - 1){
                System.out.print(", ");
            }else{
                System.out.printf("\n");
            }
        }
        //merge
        System.out.println("--Running: merge--");
        int[] c = {0, 1, 2, 3};
        int[] d = {0, 1, 2};
        c = ArrayFunctions.merge(c, d);
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
            if (i != c.length - 1){
                System.out.print(", ");
            }else{
                System.out.printf("\n");
            }
        }
    }
}
