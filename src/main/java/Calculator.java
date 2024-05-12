public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b==0) {

            System.out.println("DIVISION BY 0 MISTAKE");
            return 0;
        }
        return a/b;
    }
    public int times(int a, int b){

        return a*b;
    }
    public int solver(int a, int b){
        return dif(a, b)/2;
    }
}
