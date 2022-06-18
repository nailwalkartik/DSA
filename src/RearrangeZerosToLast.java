public class RearrangeZerosToLast {
    /**
     * int[] {4,0,1,6,7,0,8,0}
     * {4,1,6,7,8,0,0,0}
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {4,0,1,6,7,0,8,0};
//        int[] arr2 = new int[arr1.length];
        /**
         * Write index
         */
        int wi = 0;

        for (int i = 0; i< arr1.length; i++) {
            if (arr1[i] != 0) {
                arr1[wi] = arr1[i];
                wi ++;
            }
        }
        while (wi < arr1.length) {
            arr1[wi] = 0;
            wi ++;
        }
        for (int j = 0; j < arr1.length; j ++) {
            System.out.print(arr1[j]);
        }
    }
}
