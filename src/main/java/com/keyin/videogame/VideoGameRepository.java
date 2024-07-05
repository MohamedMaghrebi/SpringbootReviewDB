package com.keyin.videogame;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Dont Forget this annotation
@Repository
public interface VideoGameRepository extends CrudRepository<VideoGame,Long> {

    // If any methods are needed outside of what is provided by default. We can create our own...
    public VideoGame findByTitle(String title);

}
