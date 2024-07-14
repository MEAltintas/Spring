package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifeycelBean {

    public LifeycelBean(){
        System.out.println("Ben Contruct");
    }

    @PostConstruct
    public void init() {
        System.out.println("Ben post construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Ben pre destroy");
    }

}
