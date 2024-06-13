package itmo.java.basics.lesson4.part1;

public class SumNumbers {
    public static Boolean isThirdEqualToSum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        if (thirdNumber == firstNumber + secondNumber)  return Boolean.TRUE;
        else return Boolean.FALSE;
    }
}
