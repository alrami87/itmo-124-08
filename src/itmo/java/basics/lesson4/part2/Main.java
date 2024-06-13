package itmo.java.basics.lesson4.part2;

import itmo.java.basics.lesson4.part1.ListningNumbers;
import itmo.java.basics.lesson4.part1.ListningNumbersDevided;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1.
        int[] intArray = {1, 3, -2, 5, 2};
        //int[] intArray = {5, 7, 8, 120};
        System.out.println();
        System.out.print("array = ");
        System.out.println(Arrays.toString(intArray));
        if (CheckSortingOfArray.isItSorted(intArray)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
// 2.
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Array lenght: ");
        Integer arrayLenght = scanner.nextInt();
        System.out.println("Numbers of array: ");
        int[] intArray1 = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            intArray1[i] = scanner.nextInt();
        }
        System.out.print("Result: ");
        System.out.println(Arrays.toString(intArray1));
//  3.
        System.out.println();
        System.out.println();
        int[] intArray2 = {2, 3, -8, -9};
        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(intArray2));
        intArray2 = ArrayHeadTailChange.change(intArray2);
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(intArray2));
// 4.
        System.out.println();
        int[] intArray3 = {1, 1, 2, 3, 3, 4, 4, 5, 6, 6};
        System.out.print("Array: ");
        System.out.println(Arrays.toString(intArray3));
        Integer unicNumber = FirstUnicNumber.getNumber(intArray3);
        if (unicNumber != null)  System.out.println("Первое уникальное число: " + unicNumber);
        else System.out.println("В массиве нет уникальных чисел");
    }


}
