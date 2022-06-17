/**
 * https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1/?page=1&category[]=Strings&sortBy=submissions
 */
public class StringIsRotatable {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";

        boolean isRotatable = checkRotation(str1, str2);

        System.out.println(isRotatable);
    }

    public static Boolean checkRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.length() < 2) {
            return true;
        }
        int len = str2.length();
        String clockwise = "";
        String antiClockwise = "";

        clockwise = clockwise + str1.substring(2) + str1.substring(0,2);
        antiClockwise = antiClockwise + str1.substring(len-2, len) + str1.substring(0, len-2);
        return clockwise.equals(str2) || antiClockwise.equals(str2);
    }
}
