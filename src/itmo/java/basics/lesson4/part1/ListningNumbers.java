package itmo.java.basics.lesson4.part1;

public class ListningNumbers {
    public static void printListNumbers(Integer firstNumber, Integer secondNumber) {
// Если firstNumber > secondNumber, то меняем числа местами
        if (firstNumber > secondNumber) {
            firstNumber += secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber -= secondNumber;
        }
        for (int i = firstNumber; i <=secondNumber; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }
}
