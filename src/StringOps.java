public class StringOps {
    public static void main(String[] args) {
        String str1 = "Kartik";
        String str2 = str1;
//        System.out.println("str2 = " + str2);
//        str2 = String.join("-", str1, str1);
        System.out.println(str1 + "\n" + str2);
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true
        System.out.println(str1.hashCode() + " " + str2.hashCode());
    }
}
