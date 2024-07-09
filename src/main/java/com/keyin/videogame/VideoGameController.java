package com.keyin.videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// For each controller dont forget to tag with the below Annotations
@RestController
@CrossOrigin
public class VideoGameController {

    // In the Controller we always want to autowire in our service class so we have access to all the methods that we need.
    @Autowired
    private VideoGameService videoGameService;

    @GetMapping("/getListOfAllGames")
    public Iterable<VideoGame> getAllGames(){
        return videoGameService.getListOfGames();
    }

    // Dont forget the @RequestBody annotation in the method parameters you will get a bug!
    @PostMapping("/createANewGame")
    public VideoGame createNewGame(@RequestBody VideoGame videoGame){
        videoGameService.createNewGame(videoGame);
        return videoGame;
    }
}
