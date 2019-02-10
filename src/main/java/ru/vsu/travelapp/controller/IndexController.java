package ru.vsu.travelapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
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
}
