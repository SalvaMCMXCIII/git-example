public class Application {
    public static void main(String[] args) {

        int res = sum (7,8);
        System.out.println(res);
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    private static int sum(int i, int i1) {
        int sum = i + i1;
        return sum;
    }
    private static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
    }
}
