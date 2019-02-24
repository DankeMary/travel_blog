package ru.vsu.travelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.database.dao.CountryDao;

@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    private CountryDao dao;


    @GetMapping("/")
    public ResponseEntity simpleGet() {
        System.out.println("Hello simpleeeeeeeeeee!!!!");
        return ResponseEntity.ok("");
    }

    @GetMapping("/request")
    public ResponseEntity postController(@RequestParam("yearOfBirth") int yearOfBirth) {
        System.out.println("Hello!!!!");
        return ResponseEntity.ok(2019 - yearOfBirth);
    }

    @GetMapping("/countries")
    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8100", "http://localhost:8080"})
    public ResponseEntity getCountries() {
        System.out.println("Hello!!!!");
        return ResponseEntity.ok(dao.findAll());
    }
}
