package com.example.day8cw1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.day8cw1.model.Person;
import com.example.day8cw1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    private PersonService ser;

    @PostMapping("/person")
    public ResponseEntity<Person> post(@RequestBody Person person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<Person>> getAll(@PathVariable String value) {
        List<Person> li = ser.start(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<Person>> getbyAge(@PathVariable String value) {
        List<Person> li = ser.end(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}