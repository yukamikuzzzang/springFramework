package ch03_test2;

public class NumberTwo implements SelectNumber {
    @Override
    public void selectNumber(int number) {
        if (number == 2) System.out.println("Hello");
    }
}
