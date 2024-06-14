package itmo.java.basics.lesson4.part1;

public class SumNumbers {
    public static boolean isThirdEqualToSum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        if (thirdNumber == firstNumber + secondNumber)  return true;
        else return false;
    }
}
