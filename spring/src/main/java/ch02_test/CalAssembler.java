package ch02_test;


import ch02_test.operation.*;

public class CalAssembler {
    MyCalculator myCalculator;
    Plus plus;
    Minus minus;
    Multiply multiply;
    Division division;
    Quotiet quotiet;
    Remainder remainder;

      public CalAssembler(int fNum, int sNum) {
        myCalculator = new MyCalculator();
        plus = new Plus();
        minus = new Minus();
        multiply = new Multiply();
        division = new Division();
        quotiet = new Quotiet();
        remainder = new Remainder();

        assembler(fNum, sNum);
    }
    public void assembler(int fNum, int sNum) {
          myCalculator.calculate(fNum, sNum, plus);
          myCalculator.calculate(fNum, sNum, minus);
          myCalculator.calculate(fNum, sNum, multiply);
          myCalculator.calculate(fNum, sNum, division);
          myCalculator.calculate(fNum, sNum, quotiet);
          myCalculator.calculate(fNum, sNum, remainder);
    }
}
