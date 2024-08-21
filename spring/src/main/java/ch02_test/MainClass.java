package ch02_test;

import ch02_calcIoC.MyCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {

        System.out.println("숫자 2개를 입력");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fNum = Integer.parseInt(br.readLine());
        int sNum = Integer.parseInt(br.readLine());

        new CalAssembler(fNum,sNum);
    }
}
