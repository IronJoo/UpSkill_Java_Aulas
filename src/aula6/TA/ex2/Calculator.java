//package aula6.TA.ex2;
//
//import aula5.ex1.ArrayFunctions;
//
//public class Calculator {
//    private String[] history = new String[0];
//
//
//    public double sum(double num1, double num2){
//        save(num1 + " + " + num2 + " = " + (num1 + num2));
//        return num1 + num2;
//    }
//    public double subtract(double num1, double num2){
//        save(num1 + " - " + num2 + " = " + (num1 - num2));
//        return num1 - num2;
//    }
//    public double multiply(double num1, double num2){
//        save(num1 + " * " + num2 + " = " + (num1 * num2));
//        return num1 * num2;
//    }
//    public double divide(double num1, double num2){
//        save(num1 + " / " + num2 + " = " + (num1 / num2));
//        return num1/num2;
//    }
//    public double power(double num, double powerOf){
//        save(num + " ^ " + powerOf + " = " + Math.pow(num, powerOf));
//        return Math.pow(num, powerOf);
//    }
//    public static String[] merge(String[] a1, String[] a2){
//        String[] merge = new String[a1.length + a2.length];
//        for (int i = 0; i < a1.length; i++){
//            merge[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++){
//            merge[a1.length+i] = a2[i];
//        }
//        return merge;
//    }
//    public void save(String text){
//        String[] v = new String[1];
//        v[0] = text;
//        merge(history, v);
//    }
//
//    public String[] getHistory() {
//        return history;
//    }
//    public String[] getLastHistory(int nEntries) {
//        String[] partialHistory = new String[nEntries];
//        for (int i = 0; i < partialHistory.length; i++){
//            partialHistory[i] = history[history.length-1-i];
//        }
//        return partialHistory;
//    }
//}
