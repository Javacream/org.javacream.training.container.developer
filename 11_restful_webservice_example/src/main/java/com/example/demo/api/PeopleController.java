package com.example.demo.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/api")
public class PeopleController {

  private final List<Person> people = new CopyOnWriteArrayList<>(List.of(
      new Person("Grace", "Hopper"),
      new Person("Linus", "Torvalds")
  ));

  @GetMapping("/hello")
  public String hello() {
    return "Hello from Spring Boot in a VS Code Dev Container!";
  }

  @GetMapping("/people")
  public List<Person> list() {
    return people;
  }

  @PostMapping("/people")
  @ResponseStatus(HttpStatus.CREATED)
  public Person create(@Valid @RequestBody Person person) {
    people.add(person);
    return person;
  }
}
