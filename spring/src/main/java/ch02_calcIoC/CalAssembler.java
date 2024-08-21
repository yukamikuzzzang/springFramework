package ch02_calcIoC;

public class CalAssembler {
    MyCalculator calculator;
    CalAdd calAdd;
    CalSub calSub;
    CalMul calMul;
    CalDiv calDiv;

    public CalAssembler() {
        calculator = new MyCalculator();
        calAdd = new CalAdd();
        calSub = new CalSub();
        calMul = new CalMul();
        calDiv = new CalDiv();

        assembler();
    }

    public void assembler() {
        calculator.calculate(10, 5, calAdd);
        calculator.calculate(10, 5, calSub);
        calculator.calculate(10, 5, calMul);
        calculator.calculate(10, 5, calAdd);

    }
}
