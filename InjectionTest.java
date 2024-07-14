package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {

    private BeanTest beanTest;
    private ComponentTest componentTest;

    @Autowired
    public InjectionTest(ComponentTest componentTest,BeanTest beanTest) {
        this.componentTest = componentTest;
        this.beanTest = beanTest;
    }

    public void callBeanPrint() {
        beanTest.print();
        componentTest.print();
    }
}

