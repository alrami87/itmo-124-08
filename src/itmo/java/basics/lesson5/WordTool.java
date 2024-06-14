package itmo.java.basics.lesson5;

public class WordTool {
    public static boolean isWordPalindrome(String word) {
        if (word != null && !word.isEmpty()) {
            boolean isPalindrome = true;
            word = word.replaceAll(" ", "");
            word = word.toLowerCase();
            char[] chars = word.toCharArray();
            for (int i = 0; i < word.length() / 2; i++) {
                if (chars[i] != chars[word.length() - 1 - i]) isPalindrome = false;
            }
            return isPalindrome;
        } else {
            return false;
        }
    }
}
