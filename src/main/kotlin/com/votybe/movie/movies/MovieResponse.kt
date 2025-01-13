package com.votybe.movie.movies

data class MovieResponse(
    val page: Int,
    val results: List<MovieObject>,
    val totalPages: Int,
    val totalResults: Int
)