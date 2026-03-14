package dsa_practice.string_questions;

public class GCDofStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        if (!(str1 + str2).equals(str2 + str1))
            System.out.println("");
        else {
            int gcdLength = gcd(str1.length(), str2.length());
            System.out.println(str1.substring(0, gcdLength));
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
