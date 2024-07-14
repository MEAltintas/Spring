package yte.intern.spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CourseController {

    @RequestMapping("/courses/{id}")
    public void courses(
            @PathVariable int id,
            @RequestParam String name,
            @RequestParam String instructor) {

        String result = id + " " + name + " " + instructor;
        System.out.println(result);
    }
}