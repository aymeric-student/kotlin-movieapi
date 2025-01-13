package com.votybe.movie.movies

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/genres")
class GenreController(private val genreService: MovieService) {

    @GetMapping
    fun getAllGenres(): ResponseEntity<List<Genre>> {
        val genres = genreService.getAllGenres()
        return ResponseEntity.ok(genres)
    }
}