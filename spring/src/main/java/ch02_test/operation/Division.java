package ch02_test.operation;

import ch02_test.ICalculator;

public class Division implements ICalculator {
    @Override
    public int doOperation(int firstNum, int secondNum) {
        secondNum = secondNum > 0 ? firstNum / secondNum : 0;
        if (secondNum == 0) {
            System.out.println("Can't divide by zero");
            return secondNum;
        }
        return secondNum;
    }
}
