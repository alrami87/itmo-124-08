package itmo.java.basics.lesson5;

import java.util.regex.Pattern;

public class TextTools {
    public static String mostLongestWord(String text) {
        if (text != null && !text.isEmpty()) {
            text = text.replaceAll("\\p{Punct}", " ");
            String[] words = text.split(" ");
            int wordLenght = 0;
            String word = "";
            for (String str : words) {
                if (str.length() > wordLenght) {
                    word = str;
                    wordLenght = str.length();
                }
            }
            return word;
        } else {
            return null;
        }
    }

    public static String makeCensor(String text, String pattern, String patternTo) {
        if (text != null && !text.isEmpty()) {
            text = text.replaceAll(pattern, patternTo);
            return text;
        } else {
            return null;
        }
    }

    public static int numbersOfContains(String text, String pattern) {
        int numberOfContains = 0;
        if (pattern != null && !pattern.isEmpty()) {
            while (text.contains(pattern)) {
                numberOfContains++;
                text = text.substring(0, text.lastIndexOf(pattern));
            }
        }
        return numberOfContains;
    }

    public static String reverseAllWords(String text) {
        if (text != null && !text.isEmpty()) {

            String[] words = text.split(" ");
            text = "";
            for (String str : words) {
                StringBuilder builder = new StringBuilder();
                builder.append(str).reverse().append(" ");
                text = text + String.valueOf(builder);
            }

            text = text.substring(0, text.length() - 1);
            return text;
        }
        return null;
    }
}
