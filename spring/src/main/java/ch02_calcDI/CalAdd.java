package ch02_calcDI;

public class CalAdd implements ICalculator {
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
