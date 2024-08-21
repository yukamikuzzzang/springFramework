package ch02_calcDI;

public class MyCalculator {

    public void calculate(int fNum, int sNum, ICalculator iCalculator){
        int value = iCalculator.doOperation(fNum, sNum);
        System.out.println("value = " + value);
    }

    /*public void calAdd(
    int fNum, int sNum, CalAdd calAdd) {
        //ICalculator calculator = new CalAdd();              //CalAdd 객체 생성
        int value = calAdd.doOperation(fNum,sNum);      // 덧셈 생성
        System.out.println("result = " + value);
    }

    public void calSub(int fNum, int sNum, CalSub calSub) {
        //ICalculator calculator = new CalSub();              //calSub 객체 생성
        int value = calSub.doOperation(fNum,sNum);      //뺄셈 생성
        System.out.println("value = " + value);
    }

    public void calMul(int fNum, int sNum, CalMul calMul) {
        //ICalculator calculator = new CalMul();              //calMul 객체 생성
        int value = calMul.doOperation(fNum, sNum);     //곱셈 생성
        System.out.println("value = " + value);
    }

    public void calDiv(int fNum, int sNum, CalDiv calDiv) {
        //ICalculator calculator = new CalDiv();              //calDiv 객체 생성
        int value = calDiv.doOperation(fNum,sNum);      //나눗셈 생성
        System.out.println("value = " + value);
    }*/
}
