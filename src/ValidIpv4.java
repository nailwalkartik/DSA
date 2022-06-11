public class ValidIpv4 {
    public static boolean isValidSubSection(StringBuilder temp, int sCount) {
        if (sCount > 1 && temp.charAt(0) == '0') {
            return false;
        }
        if (sCount > 0 && sCount <= 3) {

            int sub = Integer.parseInt(new String(temp));
            //  int sub = myParseInt(temp, sCount);
            if (sub >= 0 && sub <= 255) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(String s) {
        // Write your code here

//        char[] temp = new char[3];
        int sCount = 0;
        int validSubSections = 0;

        StringBuilder temp = new StringBuilder();

        if (s.length() >= 7 && s.length() <= 15) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
                    if (s.charAt(i) == '.') {
                        if (isValidSubSection(temp, sCount)) {
                            validSubSections ++;

                            temp = new StringBuilder();
                            sCount = 0;
                        } else {
                            return false;
                        }
                    } else {
                        if (sCount == 3) {
                            return false;
                        }
//                        temp[sCount] = s.charAt(i);
                        temp.append(s.charAt(i));
                        sCount ++;
                    }

                } else {
                    return false;
                }
            }
            if (isValidSubSection(temp, sCount)) {
                validSubSections ++;
            } else {
                return false;
            }
            if (validSubSections == 4) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean smh = isValid("1.1.1.1");
    }
}
