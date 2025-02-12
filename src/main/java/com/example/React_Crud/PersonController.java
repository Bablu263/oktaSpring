package com.example.React_Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping ("/demo")
    public String greet(){
        return "anand";
    }
    // Get all people
    @GetMapping
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    // Get a person by ID
    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id) {
        return personRepository.findById(id);
    }

    // Create a new person
    @PostMapping("/save")
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    // Update an existing person
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person personDetails) {
        Person person = personRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Person not found"));

        person.setName(personDetails.getName());
        person.setAge(personDetails.getAge());

        return personRepository.save(person);
    }

    // Delete a person
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
    }
}