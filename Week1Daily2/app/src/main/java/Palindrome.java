import java.util.ArrayList;
import java.util.Iterator;

public class Palindrome {
    public static boolean checkPalindrome(String s) {
        int length = s.length();
        if (length < 2) return true;
        else
            return s.charAt(0) == s.charAt(length - 1)
                    && checkPalindrome(s.substring(1, length - 1));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("black");
        list.add("otto");
        list.add("1331");
        list.add("1243");
        list.add("@");
        list.add("#@");
        list.add("***###***");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            String it = (String) i.next();
            System.out.println("Is " + it + " a palindrome? " + checkPalindrome(it));
        }
    }
}
