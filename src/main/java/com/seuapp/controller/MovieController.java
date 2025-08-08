package com.seuapp.controller;

import com.seuapp.model.MovieResponse;
import com.seuapp.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/search")
    public List<MovieResponse> searchMovies(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String year,
            @RequestParam(required = false) String type,
            @RequestParam(defaultValue = "1") int page) {
        logger.info("Received request to search movies with title: {}, year: {}, type: {}, page: {}", title, year, type,
                page);
        List<MovieResponse> movies = movieService.searchMovies(title, year, type, page);
        logger.info("Returning {} movies", movies.size());
        return movies;
    }
}