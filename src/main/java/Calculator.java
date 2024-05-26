public class Calculator {
    public static int add(int a, int b){
        return  a + b;
    }
    public static int dif(int a, int b){
        return a - b;
    }
    public static int div(int a, int b){
        if (b == 0) {
            System.out.println("Zero in div"); //123
            return 1;
        }
        return a/b;
    }
    public static int times(int a, int b) {
        return a*b;
    }
    public static int solver(int a, int b){
        return add(a, b)/2;
    }
}
