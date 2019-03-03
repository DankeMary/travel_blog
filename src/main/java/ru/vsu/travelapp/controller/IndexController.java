package ru.vsu.travelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.database.dao.CountryDao;
import ru.vsu.service.services.CountryService;
import ru.vsu.travelapp.bean.PostBean;

@RestController
/*@CrossOrigin(origins = {"http://localhost:8100", "http://localhost:4200", "http://localhost:8080"},
        maxAge = 4800, allowCredentials = "false")*/
@RequestMapping("/")
public class IndexController {

    @Autowired
    private CountryDao dao;

    @Autowired
    private CountryService countryService;

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
    //@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8100", "http://localhost:8080"})
    public ResponseEntity getCountries() {
        System.out.println("Hello!!!!");
        return ResponseEntity.ok(countryService.getAll());
    }

    @PostMapping("/makePost")
    public ResponseEntity makePost(@RequestBody PostBean post) {
        System.out.println("Hello!!!!");
        System.out.println("Place: " + post.getPostPieces().get(0).getPlace());
        return ResponseEntity.ok("{}");
        /*return ResponseEntity.HeadersBuilder.header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build();*//*

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type, Accept, X-Requested-With");
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "POST, GET, PUT, UPDATE, OPTIONS");

        return ResponseEntity.ok()
                .headers(headers)
                .body("{}");*/
    }
}
