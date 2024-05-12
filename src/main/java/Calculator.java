public class Calculator {
    public int addnamek1305(int a, int b){
        return a+b;
    }
    public int difnamek1305(int a, int b){
        return a-b;
    }
    public int divnamek1305(int a, int b){
        if (b==0) {

            System.out.println("DIVISION BY 0 MISTAKE");
            return 0;
        }
        return a/b;
    }
    public int timesnamek1305(int a, int b){

        return a*b;
    }
    public int solvernamek1305(int a, int b){
        return difnamek1305(a, b)/2;
    }
}
