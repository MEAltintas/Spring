package yte.intern.springcore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    public void print(){
        System.out.println("Ben bir constructor'um");
    }
    @Autowired
    public void test(){
        System.out.println("Constructor");
    }
}
