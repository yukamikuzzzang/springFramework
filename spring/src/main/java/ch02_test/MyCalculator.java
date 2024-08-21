package ch02_test;

public class MyCalculator {
    public void calculate(int fNum, int sNum, ICalculator calculator){
        System.out.println(calculator.doOperation(fNum, sNum));

    }
}
