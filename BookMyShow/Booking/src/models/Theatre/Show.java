package models.Theatre;

import java.util.ArrayList;
import java.util.List;

import models.Movie.Movie;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showStartTime;
    List<Integer> bookedSeatsIds = new ArrayList<>();

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedSeatsIds() {
        return bookedSeatsIds;
    }

    public void setBookedSeatsIds(List<Integer> bookedSeatsIds) {
        this.bookedSeatsIds = bookedSeatsIds;
    }

}
