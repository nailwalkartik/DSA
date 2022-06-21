public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "pqr.mno";
        int len = s.length();
        char[] strChar = new char[len];
        int chCount = 0;

        for (int i = len-1; i >= 0; i --) {
            strChar[chCount] = s.charAt(i);
            chCount ++;
        }
        int start = 0;
        int last = -1;
        for (int j = 0; j < len; j ++) {
            ++ last;
            if (strChar[j] == '.') {
                while(start < last) {
                    char temp = strChar[start];
                    strChar[start] = strChar[last - 1];
                    strChar[last -1] = temp;
                    start ++;
                    last --;
                }
                start = j +1;
                last = j;
            }
        }
        if (start < len) {
            last = len - 1;
        }
        while (start < last) {
            char temp = strChar[start];
            strChar[start] = strChar[last];
            strChar[last] = temp;
            start ++;
            last --;
        }
        String s1 = new String(strChar);
        System.out.println(s1);
    }
}