package itmo.java.basics.lesson4.part1;

public class NumberInArray {
    public static boolean numberIsHeadOrTailOfArray(int[] array, Integer number) {
        if (number == array[0] || number == array[array.length - 1])  return true;
        else return false;
    }
    public static boolean numbersIsInArray(int[] array, Integer firstNumber, Integer secondNumber) {
        boolean result = false;
        for (int i : array) {
            if (i == firstNumber || i == secondNumber)  result = true;
        }
        return result;
    }
}
