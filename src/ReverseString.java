public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        char[] reverseStr = new char[str.length()];
        int ind = 0;
        for(int i = str.length() -1 ; i >= 0; i--) {
            reverseStr[ind] =  str.charAt(i);
            ind ++;
        }
        System.out.println(reverseStr);
    }
}
