package com.votybe.movie.config

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "movie-db")
class MovieDbConfig {
    lateinit var apiKey: String
    lateinit var baseUrl: String
    lateinit var imageBaseUrl: String
    lateinit var backdropBaseUrl: String
}