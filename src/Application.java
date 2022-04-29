public class Application {
    public static void main(String[] args) {

        int res = sum (7,8);
        System.out.println(res);
        int factorial = factorial(5);
        System.out.println(factorial);
        double res2 = sqr(2,2);
        System.out.println(res2);
        int multiples = multiple(5,3);
        System.out.println(multiples);
    }

    private static int multiple(int i, int i1){
        int mult = i * i1;
        return mult;
    }

    private static int sum(int i, int i1) {
        int sum = i + i1;
        return sum;
    }
    private static double sqr (int c, int d){
       double sqr = Math.pow(c, d);
       return sqr;
    }

    private static int factorial(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
        }
        return fact;
    }
}
