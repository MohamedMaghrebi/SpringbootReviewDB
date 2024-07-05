package com.keyin.videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

// For each controller dont forget to tag with the below Annotations
@RestController
@CrossOrigin
public class VideoGameController {

    // In the Controller we always want to autowire in our service class so we have access to all the methods that we need.
    @Autowired
    private VideoGameService videoGameService;
}
