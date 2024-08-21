package ch03_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("ch03/application-hello.xml");
        context.getBean("hello",HelloMavenProject.class);
    }
}
