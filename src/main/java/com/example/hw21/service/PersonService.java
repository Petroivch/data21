package com.example.hw21.service;

import com.example.hw21.entity.Person;
import com.example.hw21.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonByCity(city);
    }
}