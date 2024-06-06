package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        System.out.println("2.");
        double result = (46 + 10) * (10 / 3.0);
        System.out.println("Результат вычисления: " + result);
        int result1 = 29 * 4 * (-15);
        System.out.println("Результат вычисления: " + result1);

        System.out.println("3.");
        int number = 10500;
        result = (number / 10.0) / 10;
        System.out.println();
        System.out.println("Результат вычисления: " + result);

        System.out.println("4.");
        double aa = 3.6;
        double bb = 4.1;
        double cc = 5.9;
        result = aa * bb * cc;
        System.out.println("Результат вычисления: " + result);

        System.out.println("5.");
        System.out.println("Введите три числа:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("6.");
        System.out.println("Введите число:");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
