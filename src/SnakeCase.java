public class SnakeCase {

    public static void main(String[] args) {
        String name = "HackerEarthLandTest"; // hacker_earth_land_test
        int len = name.length();
        int cap = 0;

        // calculating number of capital letters
        for (int i = 1; i < len; i ++) {
            if (Character.isUpperCase(name.charAt(i))) {
                cap ++;
            }
        }

        int snakeLen = len + cap;
        char[] snakeCase = new char[snakeLen];

        int ctr = 0;
        snakeCase[ctr++] = Character.toLowerCase(name.charAt(0));
        for (int i = 1; i < len; i ++) {
            if (Character.isUpperCase(name.charAt(i))) {
                snakeCase[ctr++] = '_';
                snakeCase[ctr++] = Character.toLowerCase(name.charAt(i));
            }
            else {
                snakeCase[ctr++] = name.charAt(i);
            }
        }
        System.out.println(snakeCase);
        snakeCase(name);
    }

    public static void snakeCase(String str) {
        StringBuilder snb = new StringBuilder();

        if (Character.isUpperCase(str.charAt(0))) {
            snb.insert(0,Character.toLowerCase(str.charAt(0)));
        } else {
            snb.insert(0,str.charAt(0));
        }
        for (int i = 1; i <str.length(); i ++) {
            if (Character.isUpperCase(str.charAt(i))) {
                snb.append('_');
            }
            snb.append(Character.toLowerCase(str.charAt(i)));
        }
        System.out.println(snb);
    }
}
