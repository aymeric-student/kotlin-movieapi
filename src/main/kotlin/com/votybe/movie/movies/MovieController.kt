package com.votybe.movie.movies

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/movies")
class MovieController(private val movieService: MovieService) {

    @GetMapping("/popular")
    fun getPopularMovies(): MovieResponse {
        return movieService.getPopularMovies()
    }
}