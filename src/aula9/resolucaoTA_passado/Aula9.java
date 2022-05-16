//package aula9.resolucaoTA;
//
//public class Aula9 {
//
//    public static int[] subArray(int a, int b, int[] vector){
//        int[] v=new int[b-a+1];
//        for(int i=0;i< v.length;i++){
//            v[i]=vector[i+a];
//        }
//        return v;
//    }
//
//    public static int[] firstHalf(int[] v, boolean middle){
//        int[] novo;
//        if(v.length%2==0){
//            novo = subArray(0,v.length/2-1,v);
//        } else {
//            if(middle){
//                novo = subArray(0,v.length/2,v);
//            } else {
//                novo = subArray(0,v.length/2-1,v);
//            }
//        }
//        return novo;
//    }
//
//    public static int[] merge(int[] v1, int[] v2){
//        int[] novo = new int[v1.length+v2.length];
//        for(int i = 0; i<v1.length; i++){
//            novo[i] = v1[i];
//        }
//        for(int i = 0; i<v2.length; i++){
//            novo[v1.length + i] = v2[i];
//        }
//        return novo;
//    }
//
//    public static int[] invert(int[] v){
//        int[] novo = new int[v.length];
//        for(int i = 0; i<v.length; i++){
//            novo[i] = v[v.length-i-1];
//        }
//        return novo;
//    }
//
//    public static int[] duplicateEveryElement(int[] v){
//        int[] novo = new int[v.length*2];
//        int count = 0;
//        for(int i = 0; i<v.length; i++){
//            novo[count] = v[i];
//            novo[count+1] = v[i];
//            count += 2;
//        }
//        return novo;
//    }
//
//    public static int[] duplicateInverted(int[] v){
//        return merge(v,invert(v));
//    }
//
//    public static int[] copyWithoutMiddleElement(int[] v){
//        int[] firstHalf = firstHalf(v,false);
//        int[] secondHalf = subArray(v.length/2 + 1, v.length-1, v);
//        return merge(firstHalf,secondHalf);
//    }
//
//    public static int fibonacci(int n) {
//        if(n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//
//    public static int[] fibonacciSequence(int n){
//        int[] novo = new int[n];
//        for(int i = 0; i<novo.length; i++){
//            novo[i] = fibonacci(i);
//        }
//        return novo;
//    }
//
//}