package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);

        //TestBean testBean=context.getBean(TestBean.class);
        //testBean.print();

        //DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
        // dependencyInjectionTest.print();

        // LifeycelBean lifeycelBean = context.getBean(LifeycelBean.class);
        //lifeycelBean.print();


        ComponentTest componentTest = context.getBean(ComponentTest.class);
        componentTest.print();

        InjectionTest injectionTest = context.getBean(InjectionTest.class);
        injectionTest.callBeanPrint();
    }
}


