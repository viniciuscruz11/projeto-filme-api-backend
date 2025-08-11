package com.seuapp.service;

import com.seuapp.client.ExternalApiClient;
import com.seuapp.model.MovieResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private static final Logger logger = LoggerFactory.getLogger(MovieService.class);
    private final ExternalApiClient externalApiClient;

    @Autowired
    public MovieService(ExternalApiClient externalApiClient) {
        this.externalApiClient = externalApiClient;
    }

    @Cacheable(value = "movies", key = "#title + #year + #type + #page")
    public List<MovieResponse> searchMovies(String title, String year, String type, int page) {
        logger.info("Searching movies with title: {}, year: {}, type: {}, page: {}", title, year, type, page);
        List<MovieResponse> movies = (List<MovieResponse>) externalApiClient.searchMovies(title, year, type, page);
        logger.info("Found {} movies", movies.size());
        return movies;
    }
}
