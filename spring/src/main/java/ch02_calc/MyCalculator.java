package ch02_calc;

public class MyCalculator {
    public void calAdd(int fNum, int sNum) {
        ICalculator calculator = new CalAdd();              //CalAdd 객체 생성
        int value = calculator.doOperation(fNum,sNum);      // 덧셈 생성
        System.out.println("result = " + value);
    }

    public void calSub(int fNum, int sNum) {
        ICalculator calculator = new CalSub();              //calSub 객체 생성
        int value = calculator.doOperation(fNum,sNum);      //뺄셈 생성
        System.out.println("value = " + value);
    }

    public void calMul(int fNum, int sNum) {
        ICalculator calculator = new CalMul();              //calMul 객체 생성
        int value = calculator.doOperation(fNum, sNum);     //곱셈 생성
        System.out.println("value = " + value);
    }

    public void calDiv(int fNum, int sNum) {
        ICalculator calculator = new CalDiv();              //calDiv 객체 생성
        int value = calculator.doOperation(fNum,sNum);      //나눗셈 생성
        System.out.println("value = " + value);
    }
}
