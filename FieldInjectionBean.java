package yte.intern.springcore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FieldInjectionBean {
    public void print(){
        System.out.println("Ben bir field'im");
    }
}
