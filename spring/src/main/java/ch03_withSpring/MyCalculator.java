package ch03_withSpring;

public class MyCalculator {
   public void calculate(int fNum, int sNum, ICalculator iCalculator) {
       //ICalculator 객체 주입
       int value = iCalculator.doOperation(fNum, sNum); //연산 실행
       System.out.println("result = " + value);
   }
}
