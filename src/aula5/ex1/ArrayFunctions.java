package aula5.ex1;

public class ArrayFunctions {
    public static int[] subArray(int inicio, int fim, int[] array){ //corta array
        int[] sub = new int [fim - inicio + 1];
        for (int i = 0; i < sub.length; i++){
            sub[i] = array[i + inicio];
        }
        return sub;
    }

    public static int[] firstHalf(int[] a, boolean returnsMiddle){
        if (a.length%2 == 0){
            return subArray(0, a.length/2, a);
        }else{
            if (returnsMiddle){
                return subArray(0, a.length/2, a);
            }else{
                return subArray(0,a.length/2-1, a);
            }
        }
    }
    public static int[] merge(int[] a1, int[] a2){
        int[] merge = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++){
            merge[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++){
            merge[a1.length+i] = a2[i];
        }
        return merge;
    }
}
