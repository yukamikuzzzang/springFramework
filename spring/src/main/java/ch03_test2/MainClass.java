package ch03_test2;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine().trim());

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("ch03/application-language.xml");
        Language language = context.getBean("language",Language.class);

        language.select(number);
        context.close();
    }
}
