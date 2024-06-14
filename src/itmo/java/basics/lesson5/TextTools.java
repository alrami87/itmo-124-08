package itmo.java.basics.lesson5;

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

    public static String makeCensor(String text, String pattern) {
        if (text != null && !text.isEmpty()) {
            pattern = pattern.toLowerCase();
            String[] words = text.split(" ");
            text = "";
            for (String str : words) {
                String lowerCaseString = str.toLowerCase();
                if (lowerCaseString.contains(pattern)) {
                    str = "[вырезано цензурой]";
                }
                text = text.concat(str).concat(" ");
            }

            text = text.substring(0, text.length() - 1);
            return text;
        } else {
            return null;
        }
    }

    public static String makeCensor(String text, String pattern, String patternTo) {
        if (text != null && !text.isEmpty()) {
            pattern = pattern.toLowerCase();
            String[] words = text.split(" ");
            text = "";
            for (String str : words) {
                String lowerCaseString = str.toLowerCase();
                if (lowerCaseString.contains(pattern)) {
                    str = patternTo;
                }
                text = text.concat(str).concat(" ");

            }
            text = text.substring(0, text.length() - 1);
            return text;
        } else {
            return null;
        }
    }

    public static int numbersOfContains(String text, String pattern) {
        int numberOfContains = 0;
        text = " " + text + " ";
        if (pattern != null && !pattern.isEmpty()) {
            String[] words = text.split(pattern);
            for (String str : words) {
                numberOfContains++;
            }
            numberOfContains--;
        }
        return numberOfContains;
    }

    public static String reverseAllWords(String text) {
        if (text != null && !text.isEmpty()) {
            String[] words = text.split(" ");
            text = "";
            for (String str : words) {
                char[] chars = str.toCharArray();
                for (int i = 0; i < str.length() / 2; i++) {
                    char tempChar = chars[i];
                    chars[i] = chars[str.length() - 1 - i];
                    chars[str.length() - 1 - i] = tempChar;
                }
                str = "";
                for (char tempChar : chars) {
                    str = str.concat(String.valueOf(tempChar));
                }
                text = text.concat(str).concat(" ");
            }
            text = text.substring(0, text.length() - 1);
            return text;
        }
        return null;
    }
}
