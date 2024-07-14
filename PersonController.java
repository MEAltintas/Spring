package yte.intern.spring_web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @PostMapping("/person")
    public List<Person> getPerson(@RequestBody List<Person> people) {
        people.forEach(Person::incrementYas);
        return people;
    }
}
