package ch03_withSpring;

public class CalMul implements ICalculator {
    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}


