import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    static long first = 0, second = 1, third;
    static long n1 = 0, n2 = 1, n3 = n1 + n2;

    static HashMap<Integer, Integer> fibNum = new HashMap<>();
    /**
     * fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count: ");
        int count = sc.nextInt();

        System.out.println("Using simple Iteration: ");
//        System.out.print(first + " " + second + " ");

        simpleIteration(count);

        System.out.println("Using recursive strategy: ");
//        System.out.print(n1 + " " + n2 + " ");
//
        recursiveMethod(count - 2);
        System.out.print(n3 + "\n");

        System.out.println("Dynamic programming strategy: ");
        fibNum.put(1,0);
        fibNum.put(2,1);
        int f = nthFibDP(count);
        System.out.println(f);
    }

    public static void simpleIteration (int count) {
        for(int i = 2; i < count; i ++) {
            third = first + second;
            first = second;
            second = third;
//            System.out.print(third + " ");
        }
        System.out.println(third);
    }

    public static void recursiveMethod(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
//            System.out.print(n3 + " ");
            recursiveMethod(count - 1);
        }
    }

    public static int nthFibDP(int n) {
//        int[] f = new int[num + 2];
//        f[0] = 0;
//        f[1] = 1;
//
//        for (int i = 2; i <= num; i ++) {
//            f[i] = f[i-1] + f[i - 2];
//        }
//        return f[num-1];
        if (fibNum.containsKey(n)){
            return fibNum.get(n);
        }
        int result = nthFibDP(n - 1) + nthFibDP(n - 2);
        fibNum.put(n,result);
        return result;
    }
}
