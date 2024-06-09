package itmo.java.basics.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//  Числа типа Integer
        System.out.println();
        Integer intFirstNum = 10;
        Integer intSecondNum = 50;
        System.out.println("Первое число: " + intFirstNum + "   второе число: " + intSecondNum);
        System.out.println("Сумма равна " + calculator.getSum(intFirstNum,intSecondNum));
        System.out.println("Разница равна " + calculator.getDif(intFirstNum,intSecondNum));
        System.out.println("Произведение равно " + calculator.getMul(intFirstNum,intSecondNum));
        System.out.println("Частное равно " + calculator.getDiv(intFirstNum,intSecondNum));

//  Числа типа Long
        System.out.println();
        Long longFirstNum = 3000000L;
        Long longSecondNum = -2000L;
        System.out.println("Первое число: " + longFirstNum + "   второе число: " + longSecondNum);
        System.out.println("Сумма равна " + calculator.getSum(longFirstNum, longSecondNum));
        System.out.println("Разница равна " + calculator.getDif(longFirstNum, longSecondNum));
        System.out.println("Произведение равно " + calculator.getMul(longFirstNum, longSecondNum));
        System.out.println("Частное равно " + calculator.getDiv(longFirstNum, longSecondNum));

//  Числа типа Double
        System.out.println();
        Double doubleFirstNum = 1000.2;
        Double doubleSecondNum = 50.7;
        System.out.println("Первое число: " + doubleFirstNum + "   второе число: " + doubleSecondNum);
        System.out.println("Сумма равна " + calculator.getSum(doubleFirstNum, doubleSecondNum));
        System.out.println("Разница равна " + calculator.getDif(doubleFirstNum, doubleSecondNum));
        System.out.println("Произведение равно " + calculator.getMul(doubleFirstNum, doubleSecondNum));
        System.out.println("Частное равно " + calculator.getDiv(doubleFirstNum, doubleSecondNum));

//  Ввод чисел с клавиатуры
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            calculator.setFirstNumber(number);
        } else {
            System.out.println("Извините, это не целое число. Перезапустите программу и попробуйте снова!");
            return;
        }
        //intcalculator.setFirstNumber(scanner.nextInt());
        System.out.println("Введите второе число");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            calculator.setSecondNumber(number);
        } else {
            System.out.println("Извините, это не целое число. Перезапустите программу и попробуйте снова!");
            return;
        }
        //intcalculator.setSecondNumber(scanner.nextInt());
        System.out.println("Сумма равна " + calculator.getSum());
        System.out.println("Разница равна " + calculator.getDif());
        System.out.println("Произведение равно " + calculator.getMul());
        System.out.println("Частное равно " + calculator.getDiv());

        System.out.println();
        Conditioner conditioner1 = new Conditioner("ROYAL Clima", "Tessoro RM-TS17CH-E");
        System.out.println(conditioner1);
        conditioner1.setModeCount(3);
        conditioner1.setWeight(12.6);
        System.out.println(conditioner1);
        System.out.println("Масса нетто равна: " + conditioner1.getWeight());
        System.out.println("Масса брутто равна: " + TotalWeight.getTotalWeight(conditioner1,2.5));
    }
}
