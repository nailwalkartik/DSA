public class Fibonacci {
    /**
     * fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13
     */
    public static void main(String[] args) {
        long first = 0;
        long second = 1;
        long third = first + second;
        int num = 15;

        System.out.print(first + " " + second + " " + third + " ");

        for(int i = 2; i < num; i ++) {
            first = second;
            second = third;
            third = first + second;
            System.out.print(third + " ");
        }
    }

    public
}
