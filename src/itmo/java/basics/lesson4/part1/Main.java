package itmo.java.basics.lesson4.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
// 1.
        ListningNumbers.printListNumbers(1, 99);

// 2.
        System.out.println();
        ListningNumbersDevided.printListNumbers(1, 100);
// 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextInt();
        System.out.print("Введите третье число: ");
        thirdNumber = scanner.nextInt();
        System.out.println("Результат: " + SumNumbers.isThirdEqualToSum(firstNumber, secondNumber, thirdNumber));
// 4.
        System.out.println();
        System.out.println();
        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextInt();
        System.out.print("Введите третье число: ");
        thirdNumber = scanner.nextInt();
        System.out.println("Результат: " + ComparisonNumbers.comparison(firstNumber, secondNumber, thirdNumber));
// 5.
        System.out.println();
        System.out.println();
        int[] intArray = {5, 7, -8, 120, -3, -8, 3};
        int number = 5;
        System.out.print("array = ");
        for (int i : intArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(NumberInArray.numberIsHeadOrTailOfArray(intArray, number));
// 5.
        System.out.println();
        System.out.println();
        int[] intArray1 = {0, 4, -2, 3, 9};
        System.out.print("array = ");
        for (int i : intArray1) {
            System.out.print(i + ", ");
        }
        firstNumber = 1;
        secondNumber = 3;
        System.out.println();
        if (NumberInArray.numbersIsInArray(intArray1, firstNumber, secondNumber)) {
            System.out.println("Массив содержит число " + firstNumber + " или " + secondNumber);
        }
        else {
            System.out.println("Массив не содержит числа " + firstNumber + " и " + secondNumber);
        }
    }
}
