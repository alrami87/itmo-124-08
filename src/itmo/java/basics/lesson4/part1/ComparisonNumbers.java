package itmo.java.basics.lesson4.part1;

public class ComparisonNumbers {
    public static Boolean comparison(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        if (secondNumber > firstNumber && thirdNumber > secondNumber)  return Boolean.TRUE;
        else return Boolean.FALSE;
    }
}
