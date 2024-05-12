public class Calculator {
    public static int addAD(int a, int b){
        return a+b;}
    public static int addSH(int a, int b){
        return  a + b;}

    public static int difAD(int a, int b){
        return a-b;}
    public static int difSH(int a, int b){
        return a - b;}

    public static int divAD(int a, int b){
        return a/b;}
    public static int divSH(int a, int b){
        if (b == 0) {
            System.out.println("Zero in div");
            return 1;}
        return a/b;}

    public static int timesAD(int a, int b){
        return a*b;}
    public static int timesSH(int a, int b) {
        return a*b;}

    public static int solverAD(int a,int b){
        return addAD(a,b)/2;}
    public static int solverSH(int a, int b){
        return addSH(a, b)/2;}
}
