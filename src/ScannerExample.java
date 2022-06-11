import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your YOB: ");
        int yearOfBirth = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Your name is: " + name + ", your year of birth is: " + yearOfBirth);

        sc.close();
    }
}
