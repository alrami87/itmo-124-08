package itmo.java.basics.lesson5;

public class WordTool {
    public static boolean isWordPalindrome(String word) {
        if (word != null && !word.isEmpty()) {
            StringBuilder builder = new StringBuilder(word.toLowerCase());
            return word.toLowerCase().equals(String.valueOf(builder.reverse()));
        } else {
            return false;
        }
    }
}
