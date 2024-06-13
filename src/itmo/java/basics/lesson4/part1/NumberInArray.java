package itmo.java.basics.lesson4.part1;

public class NumberInArray {
    public static Boolean numberIsHeadOrTailOfArray(int[] array, Integer number) {
        if (number == array[0] || number == array[array.length - 1])  return Boolean.TRUE;
        else return Boolean.FALSE;
    }
    public static Boolean numbersIsInArray(int[] array, Integer firstNumber, Integer secondNumber) {
        Boolean result = Boolean.FALSE;
        for (int i : array) {
            if (i == firstNumber || i == secondNumber)  result = Boolean.TRUE;
        }
        return result;
    }
}
