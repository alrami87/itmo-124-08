package itmo.java.basics.lesson2;

public class Calculator {
    private Double firstNumber;
    private Double secondNumber;

    public Calculator(){}
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
    //Sum
    public Double getSum() {
        return firstNumber + secondNumber;
    }
    public Double getSum( Integer firstNumber, Integer secondNumber) {
        return 1.0 * (firstNumber + secondNumber);
    }
    public Double getSum( Long firstNumber, Long secondNumber) {
        return 1.0 * (firstNumber + secondNumber);
    }
    public Double getSum( Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }
    //Dif
    public Double getDif() {
        return firstNumber - secondNumber;
    }
    public Double getDif( Integer firstNumber, Integer secondNumber) {
        return 1.0 * (firstNumber - secondNumber);
    }
    public Double getDif( Long firstNumber, Long secondNumber) {
        return 1.0 * (firstNumber - secondNumber);
    }
    public Double getDif( Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }
    //Mul
    public Double getMul() {
        return firstNumber * secondNumber;
    }
    public Double getMul( Integer firstNumber, Integer secondNumber) {
        return 1.0 * (firstNumber * secondNumber);
    }
    public Double getMul( Long firstNumber, Long secondNumber) {
        return 1.0 * (firstNumber * secondNumber);
    }
    public Double getMul( Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }
    // Div
    public Double getDiv() {
        return firstNumber / secondNumber;
    }
    public Double getDiv( Integer firstNumber, Integer secondNumber) {
        return firstNumber * 1.0 / secondNumber;
    }
    public Double getDiv( Long firstNumber, Long secondNumber) {
        return firstNumber * 1.0 / secondNumber;
    }
    public Double getDiv( Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }
}