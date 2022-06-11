import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        int numberCount = 1;
        Scanner sc = new Scanner(System.in);
        int numberSum = 0;

        while(numberCount < 11) {
            System.out.print("Enter your #" + numberCount + " number: ");
            boolean hasNextInt = sc.hasNextInt();

            if(hasNextInt) {
                int number  = sc.nextInt();
                numberSum += number;
                numberCount ++;
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        System.out.println("Sum of numbers input by you is " + numberSum);
        sc.close();
    }
}
