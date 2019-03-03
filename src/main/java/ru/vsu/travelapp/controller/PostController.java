package ru.vsu.travelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.service.services.PlaceService;
import ru.vsu.service.services.PostService;
import ru.vsu.utils.GeneralUtils;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private PlaceService placeService;

    @GetMapping("/all")
    //@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8100", "http://localhost:8080"})
    public ResponseEntity getPosts(@RequestParam String page) {
        Integer requestedPage = GeneralUtils.parseIntForPage(page, 1, postService.countPagesPosts(GeneralUtils.MAX_PAGE_RESULT));
        if (requestedPage != null) {
            return ResponseEntity.ok(postService.getPostsForPage(requestedPage, GeneralUtils.MAX_PAGE_RESULT));
        } else {
            return ResponseEntity.ok(GeneralUtils.EMPTY_RESPONSE_OK);
        }
    }

    @GetMapping("/findPlace")
    //@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8100", "http://localhost:8080"})
    public ResponseEntity findInPlaces(@RequestParam String place) {
        return ResponseEntity.ok(placeService.findPossiblePlaces(place));
    }
}
