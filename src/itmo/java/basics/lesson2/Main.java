package itmo.java.basics.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Числа типа Integer
        System.out.println();
        Integer intFirstNum = 10;
        Integer intSecondNum = 50;
        System.out.println("Первое число: " + intFirstNum + "   второе число: " + intSecondNum);
        Calculator intCalculator = new Calculator(intFirstNum, intSecondNum);
        System.out.println("Сумма равна " + intCalculator.getSum());
        System.out.println("Разница равна " + intCalculator.getDiff());
        System.out.println("Произведение равно " + intCalculator.getMul());
        System.out.println("Частное равно " + intCalculator.getDiv());

        //  Числа типа Long
        System.out.println();
        Long longFirstNum = 3000000L;
        Long longSecondNum = -2000L;
        System.out.println("Первое число: " + longFirstNum + "   второе число: " + longSecondNum);
        Calculator longCalculator = new Calculator(longFirstNum, longSecondNum);
        System.out.println("Сумма равна " + longCalculator.getSum());
        System.out.println("Разница равна " + longCalculator.getDiff());
        System.out.println("Произведение равно " + longCalculator.getMul());
        System.out.println("Частное равно " + longCalculator.getDiv());

        //  Числа типа Double
        System.out.println();
        Double doubleFirstNum = 1000.2;
        Double doubleSecondNum = 50.7;
        System.out.println("Первое число: " + doubleFirstNum + "   второе число: " + doubleSecondNum);
        Calculator doubleCalculator = new Calculator(doubleFirstNum, doubleSecondNum);
        System.out.println("Сумма равна " + doubleCalculator.getSum());
        System.out.println("Разница равна " + doubleCalculator.getDiff());
        System.out.println("Произведение равно " + doubleCalculator.getMul());
        System.out.println("Частное равно " + doubleCalculator.getDiv());

        //  Ввод чисел с клавиатуры
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            intCalculator.setFirstNumber(number);
        } else {
            System.out.println("Извините, это не целое число. Перезапустите программу и попробуйте снова!");
            return;
        }
        //intCalculator.setFirstNumber(scanner.nextInt());
        System.out.println("Введите второе число");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            intCalculator.setSecondNumber(number);
        } else {
            System.out.println("Извините, это не целое число. Перезапустите программу и попробуйте снова!");
            return;
        }
        //intCalculator.setSecondNumber(scanner.nextInt());
        System.out.println("Сумма равна " + intCalculator.getSum());
        System.out.println("Разница равна " + intCalculator.getDiff());
        System.out.println("Произведение равно " + intCalculator.getMul());
        System.out.println("Частное равно " + intCalculator.getDiv());
    }
}
