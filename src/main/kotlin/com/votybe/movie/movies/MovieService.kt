package com.votybe.movie.movies

import com.votybe.movie.config.MovieDbConfig
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class MovieService(
    private val restTemplate: RestTemplate,
    private val movieDbConfig: MovieDbConfig
) {
    fun getPopularMovies(): MovieResponse {
        val url = "${movieDbConfig.baseUrl}/movie/popular?api_key=${movieDbConfig.apiKey}"
        return restTemplate.getForObject(url, MovieResponse::class.java)
            ?: MovieResponse(0, emptyList(), 0, 0)
    }

    fun getAllGenres(): List<Genre> {
        val url = "${movieDbConfig.baseUrl}/genre/movie/list?api_key=${movieDbConfig.apiKey}"
        val response = restTemplate.getForObject(url, GenreResponse::class.java)
        return response?.genres ?: emptyList()
    }
}