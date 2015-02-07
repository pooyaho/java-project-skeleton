package com.caspco.excersice.skeleton.rest;

import com.caspco.excersice.skeleton.PersonDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author : Пуя Гуссейни
 *         Email : info@pooya-hfp.ir,pooya.husseini@gmail.com
 *         Date: ${Date}
 *         Time: ${time}
 */

@RestController
@RequestMapping("/person")
public class PersonRestController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@RequestBody PersonDto person) {
        return "Hello " + person.getName();
    }

    @PostConstruct
    public void sayHi(){
        System.out.println("Hi");
    }
}