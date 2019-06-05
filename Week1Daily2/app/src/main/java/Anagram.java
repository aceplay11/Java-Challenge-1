import java.util.Arrays;


public class Anagram {
    public static boolean checkAnagrams(String word1, String word2) {

        char[] wd1 = word1.toCharArray();
        char[] wd2 = word2.toCharArray();

        int w1 = word1.length();
        int w2 = word2.length();

        if (w1 != w2) {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
            return false;
        }

        System.out.println(word1);
        System.out.println(word2);
        Arrays.sort(wd1);

        Arrays.sort(wd2);

        for (int j = 0; j < w1 ; j++) {
            System.out.println(wd1[j]);
        }

        for (int k = 0; k < w2; k++) {
            System.out.println(wd2[k]);
        }

        for (int i = 0; i < w1; i++) {
            if (wd1[i] != wd2[i]) {
                System.out.println(word1 + " and " + word2 + " are not anagrams.");
                return false;
            }

        }
        System.out.println(word1 + " and " + word2 + " are anagrams.");
        return true;

    }

    public static void main(String[] args) {
        String x = "item";
        String y = "emit";
        String v = "detour";
        String z = "routed";
        String m = "race";

        checkAnagrams(x, y);
        checkAnagrams(x, z);
        checkAnagrams(x, m);


    }
}
