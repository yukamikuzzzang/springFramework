package ch03_test2;

public class NumberOne implements SelectNumber{
    @Override
    public void selectNumber(int number) {
        if (number == 1) System.out.println("안녕하세요.");
    }
}
