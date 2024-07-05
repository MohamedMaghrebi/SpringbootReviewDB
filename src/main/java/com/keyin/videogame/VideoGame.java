package com.keyin.videogame;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// Dont Forget to Annotate This with @Entity
@Entity
public class VideoGame {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long gameId;

     private String title;

     private String genre;

     private String releaseDate;

     public VideoGame() {
     }

     public VideoGame(Long gameId, String title, String genre, String releaseDate) {
          this.gameId = gameId;
          this.title = title;
          this.genre = genre;
          this.releaseDate = releaseDate;
     }

     public Long getGameId() {
          return gameId;
     }

     public void setGameId(Long gameId) {
          this.gameId = gameId;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public String getReleaseDate() {
          return releaseDate;
     }

     public void setReleaseDate(String releaseDate) {
          this.releaseDate = releaseDate;
     }
}
