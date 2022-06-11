import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("You shall now input the elements of the array: \n");

        for (int i = 0; i < len; i ++) {
            System.out.println("Enter " + i + " element:");
            arr.add(i, sc.nextInt());
            sc.nextLine();
        }
        Collections.sort(arr);
        System.out.println("Printing out your array: ");
        for (int j = 0; j < len; j ++) {
            System.out.print(arr.get(j));
            System.out.print(" ");
        }
        sc.nextLine();
        System.out.println("Enter the element you want to find:");
        int number = sc.nextInt();
        sc.nextLine();
        int low = 0, high = len-1, mid = (low + high)/2;
        while(low < high) {
            if (number == arr.get(mid)) {
                System.out.println("your number is at: " + mid + " position");
                break;
            }
            if (number < arr.get(mid)) {
                high = mid;
                mid = (low + high)/2;
            }
            if (number > arr.get(mid)) {
                low = mid;
                mid = (low + high)/2;
            }
            else {
                System.out.println("The number you are looking for is not here");
                break;
            }
        }
        sc.close();
    }
}
