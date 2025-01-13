package com.votybe.movie.movies;

data class MovieObject(
    val id: Long,
    val title: String,
    val originalTitle: String?,
    val overview: String,
    val releaseDate: String?,
    val popularity: Double,
    val voteAverage: Double,
    val voteCount: Int,
    val posterPath: String?,
    val backdropPath: String?,
    val genreIds: List<Int> = emptyList(),
    val adult: Boolean,
    val video: Boolean
)
