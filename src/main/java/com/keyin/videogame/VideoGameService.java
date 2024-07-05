package com.keyin.videogame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Always tag with @Service when you are making a new service
@Service
public class VideoGameService {

    // We always want to autowire in our repository when we are working with out database and creating a service class
    @Autowired
    private VideoGameRepository videoGameRepository;

    public Iterable<VideoGame> getListOfGames(){
        return videoGameRepository.findAll();
    }

    public VideoGame findGameByTitle(String title){
        return videoGameRepository.findByTitle(title);
    }
    // Instead Of Using A List For Our Memory We Will USe The Repository
    //List<VideoGame> videoGameList;

}
