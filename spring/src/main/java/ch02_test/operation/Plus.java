package ch02_test.operation;

import ch02_test.ICalculator;

public class Plus implements ICalculator {
    @Override
    public int doOperation(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
