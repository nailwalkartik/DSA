public class FindSubstringIndex {
    public static void main(String[] args) {
        String s = "12312312341";
        String x = "41";

        int xInd = 0;
        int xLen = x.length();
        int foundInd = 0;

        for (int i = 0; i < s.length(); i ++) {
            int k = i;
            for (int j = 0; j < xLen; j ++) {
                if (xInd == xLen) {
                    break;
                }
                if (k > s.length() - 1) {
                    break;
                }
                if (s.charAt(k) == x.charAt(j)) {
                    foundInd = i;
                    k ++;
                    xInd ++;
                } else {
                    xInd = 0;
                    break;
                }
            }
        }
        if (xInd > 0 && xInd == xLen) {
            System.out.println(foundInd);
        } else {
            System.out.println("-1");
        }
    }
}
