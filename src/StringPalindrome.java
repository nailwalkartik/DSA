/**
 * @link https://practice.geeksforgeeks.org/problems/palindrome-string0817/1/?page=1&category[]=Strings&sortBy=submissions
 */

public class StringPalindrome {
    int isPalindrome(String S) {
        // code here
        int start=0, last = S.length() - 1;
        char temp;

        while(start < last) {
            if (S.charAt(start) == S.charAt(last)) {
                last --;
                start ++;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
