package ch02_calcDI;

public class MainClass {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        calculator.calculate(10,5, new CalAdd());
        calculator.calculate(10,5, new CalSub());
        calculator.calculate(10,5, new CalMul());
        calculator.calculate(10,5, new CalDiv());
    }
}
 