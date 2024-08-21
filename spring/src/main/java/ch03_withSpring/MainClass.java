package ch03_withSpring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:ch03/applicationContextCalc.xml");
        CalAssembler calAssembler = ctx.getBean("calAssembler",CalAssembler.class);
        calAssembler.assemble();

        ctx.close();
    }
}
