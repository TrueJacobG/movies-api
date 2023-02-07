package com.github.truejacobg.movies.api.movie;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(ObjectId id){
        return movieRepository.findById(id).orElseThrow();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
