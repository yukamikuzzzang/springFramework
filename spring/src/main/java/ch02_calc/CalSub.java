package ch02_calc;

public class CalSub implements ICalculator {
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
