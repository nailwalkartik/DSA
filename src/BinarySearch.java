import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,9,12,45,67};
        boolean bool = binarySearch(arr, 67);
    }

    public static Boolean binarySearch(int[] arr, int num) {
        int start = 0, last = arr.length-1, mid = (start + last)/2;

        while (last >= start) {
            if (arr[mid] == num) {
                System.out.println("Found num at index: " + mid);
                return true;
            }
            if (num < arr[mid]) {
                last = mid-1;
            }
            if (num > arr[mid]) {
                start = mid +1;
            }
            mid = (start + last)/2;
        }
        return false;
    }
}
