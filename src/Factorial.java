public class Factorial {

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }
    public static int factorial (int num) {
//        while (num > 0) {
//            return num * factorial(num - 1);
//        }
//        return 1;
        if (num == 0) {
            return 1;
        }
        return num*factorial(num-1);
    }
}
