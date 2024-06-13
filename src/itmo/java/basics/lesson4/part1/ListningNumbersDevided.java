package itmo.java.basics.lesson4.part1;

public class ListningNumbersDevided {
    public static void printListNumbers(Integer firstNumber, Integer secondNumber) {
// Если firstNumber > secondNumber, то меняем числа местами
        if (firstNumber > secondNumber) {
            firstNumber += secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber -= secondNumber;
        }

        System.out.print("Делится на 3:");
        for (int i = firstNumber; i <=secondNumber; i++) {
            if (i % 3 == 0) System.out.print(" " + i);
        }

        System.out.println();
        System.out.print("Делится на 5:");
        for (int i = firstNumber; i <=secondNumber; i++) {
            if (i % 5 == 0) System.out.print(" " + i);
        }

        System.out.println();
        System.out.print("Делится на 3 и на 5:");
        for (int i = firstNumber; i <=secondNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(" " + i);
        }
    }
}
