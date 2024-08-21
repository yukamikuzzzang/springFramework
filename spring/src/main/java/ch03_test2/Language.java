package ch03_test2;

public class Language {
    Number number;
    NumberOne numberOne;
    NumberTwo numberTwo;

    public Language(Number number, NumberOne numberOne, NumberTwo numberTwo) {
        this.number = number;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void select(int num) {
        number.selectNumber(num, numberOne);
        number.selectNumber(num, numberTwo);
    }
}
