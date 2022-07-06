import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        String sentence = "Man is stupid.";
        int start = 0, end = 0;
        StringBuilder strB = new StringBuilder();
        TreeMap<Integer, ArrayList<String>> orderedMap = new TreeMap<>();

        for (int i = 0; i < sentence.length(); i ++) {
            if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
                int key = end  - start;
                String x = sentence.substring(start, end);
                ArrayList<String> temp = orderedMap.get(key);

                if(temp == null) {
                    temp = new ArrayList<>();
                    if (start  == 0) {
                        x = x.toLowerCase();
                    }
                    temp.add(x);

                    start = end  = i + 1;
                    orderedMap.put(key, temp);
                    continue;
                }
                if (start  == 0) {
                    x = x.toLowerCase();
                }
                temp.add(x);

                start = end  = i + 1;
            } else {
                end ++;
                // strB.append(sentence.charAt(i));
            }
            // orderedMap.forEach((k, v) -> System.out.println(v));

        }
        for (Map.Entry<Integer, ArrayList<String>> entry : orderedMap.entrySet()) {
            ArrayList<String> temp = entry.getValue();
            for(String st: temp)
            {
                strB.append(st);
                strB.append(" ");
            }

        }
        if (strB.length() > 0) {
            strB.setCharAt(0, Character.toUpperCase(strB.charAt(0)));
            strB.setCharAt(strB.length() - 1, '.');
        }

//        return strB.toString();
        System.out.println(strB);
}
}
class Result {

    /*
     * Complete the 'arrange' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING sentence as parameter.
     */

    public static String arrange(String sentence) {
        // Write your code here
        int start = 0, end = 0;
        StringBuilder strB = new StringBuilder();
        TreeMap<Integer, ArrayList<String>> orderedMap = new TreeMap<>();

        for (int i = 0; i < sentence.length(); i ++) {
            if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
                int key = end  - start;
                String x = sentence.substring(start, end);
                ArrayList<String> temp = orderedMap.get(key);

                if(temp == null) {
                    temp = new ArrayList<String>();
                    if (start  == 0) {
                        x = x.toLowerCase();
                    }
                    temp.add(x);

                    start = end  = i + 1;
                    orderedMap.put(key, temp);
                    continue;
                }
                if (start  == 0) {
                    x = x.toLowerCase();
                }
                temp.add(x);

                start = end  = i + 1;
            } else {
                end ++;
                // strB.append(sentence.charAt(i));
            }
            // orderedMap.forEach((k, v) -> System.out.println(v));

        }
        for (Map.Entry<Integer, ArrayList<String>> entry : orderedMap.entrySet()) {
            ArrayList<String> temp = entry.getValue();
            for(String st: temp)
            {
                strB.append(st);
                strB.append(" ");
            }

        }
        strB.setCharAt(0, Character.toUpperCase(strB.charAt(0)));
        strB.setCharAt(strB.length() - 1, '.');

        return strB.toString();
    }


}