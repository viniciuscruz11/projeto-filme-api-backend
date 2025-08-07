package com.seuapp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "external-api", url = "http://www.omdbapi.com/?apikey=1c7e315c")
public interface ExternalApiClient {

    @GetMapping("/movies")
    List<MovieResponse> searchMovies(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "year", required = false) String year,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "id", required = false) String id,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page);
}
