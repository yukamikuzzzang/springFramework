package ch02_calc;

public class CalDiv implements ICalculator {
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
       return secondNumber != 0 ? (firstNumber / secondNumber) : 0;
    }
}
