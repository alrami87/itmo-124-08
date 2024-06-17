package itmo.java.basics.lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String text = "Lorem Ipsum 123 - это текст-\"бяка\", часто используемыйвпечати и вэб-дизайне. Рыба является стандартной \"рыбой\" для текстов на латинице с начала XVI века.";
        System.out.println(text);
// 1.
        System.out.println("Самое длинное слово: " + TextTools.mostLongestWord(text));
// 2.
        System.out.println();
        String word = "Довод";
        System.out.println(word + " - это палиндром: " + WordTool.isWordPalindrome(word));
// 3.
        System.out.println();
        System.out.println(TextTools.makeCensor(text, "бяка", "[вырезано цензурой]"));
//        4.
        System.out.println();
        String string1 = "Бяка является стандартной \"рыбой\" для текстов на латинице с начала XVI века является стандартной";
        String string2 = "стандартной";
        System.out.println("Число вхождений: " + TextTools.numbersOfContains(string1, string2));
// 5.
        System.out.println();
        string1 = "This is a test string";
        System.out.println("Sample Output:");
        System.out.println("The given string is: " + string1);
        System.out.println("The string reversed word by word is: ");
        System.out.println(TextTools.reverseAllWords(string1));
    }
}
