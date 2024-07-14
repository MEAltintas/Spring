package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {
    @Autowired
    private FieldInjectionBean fieldInjectionBean;
    private SetterInjevtionBean setterInjevtionBean;
    private ConstructorInjectionBean constructorInjectionBean;

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean constructorInjectionBean) {
        this.constructorInjectionBean = constructorInjectionBean;
    }

    @Autowired
    public void setSetterInjectionBean(SetterInjevtionBean setterInjevtionBean) {
        this.setterInjevtionBean = setterInjevtionBean;
    }


    public void print() {
        fieldInjectionBean.print();
        setterInjevtionBean.print();
        constructorInjectionBean.print();
    }
}

