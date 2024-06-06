package itmo.java.basics.lesson2;

public class Calculator {
    private Double firstNumber;
    private Double secondNumber;

    public Calculator(Integer firstNumber, Integer secondNumber){
        this.firstNumber = 1.0 * firstNumber;
        this.secondNumber = 1.0 * secondNumber;
    }
    public Calculator(Long firstNumber, Long secondNumber){
        this.firstNumber = 1.0 * firstNumber;
        this.secondNumber = 1.0 * secondNumber;
    }
    public Calculator(Double firstNumber, Double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(Integer firstNumber){
        this.firstNumber = 1.0 * firstNumber;
    }
    public void setSecondNumber(Integer secondNumber){
        this.secondNumber = 1.0 * secondNumber;
    }

    public Double getSum() {
        return firstNumber + secondNumber;
    }

    public Double getDiff() {
        return firstNumber - secondNumber;
    }

    public Double getMul() {
        return firstNumber * secondNumber;
    }

    public Double getDiv() {
        return firstNumber / secondNumber;
    }
}
