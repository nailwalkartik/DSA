import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindCharacterOccurrences {
    public static void main(String[] args) {
        String str1 = "My name is Mohan";
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i <str1.length(); i ++) {
            char ch = str1.charAt(i);
            ch = Character.toLowerCase(ch);

            if (ch == ' ') {
                continue;
            }
            if (!charCount.containsKey(ch)){
                charCount.put(ch, 1);
            } else {
                int val = charCount.get(ch);
                charCount.put(ch, ++val);
            }
        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : charCount.entrySet()) {
//            System.out.print(((Map.Entry<?, ?>) characterIntegerEntry).getKey() + " ");
//            System.out.print(((Map.Entry<?, ?>) characterIntegerEntry).getValue() + "\n");
//        }

        charCount.forEach((k, v) -> System.out.println(k + " : " + v)); //consumer interface
        charCount(str1);
    }

    public static void charCount(String str1) {
        int[] charMap = new int[26];

        for (int i = 0; i <str1.length(); i ++) {
            char ch = str1.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                continue;
            }
            ch = Character.toLowerCase(ch);
            int lookUp = ch - 'a';

            charMap[lookUp]++;
        }
        for (int i = 0; i < 26; i ++) {
            if (charMap[i] > 0)
                System.out.println(((char)(i+'a')) + " : " + charMap[i]);
        }
    }
}
