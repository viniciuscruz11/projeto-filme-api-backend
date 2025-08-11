package com.seuapp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.seuapp.model.MovieResponse;

import java.util.List;

@FeignClient(name = "external-api", url = "http://www.omdbapi.com/?apikey=1c7e315c")
public interface ExternalApiClient {

      MovieResponse searchMovies(String title, String year, String type, int page);
}
