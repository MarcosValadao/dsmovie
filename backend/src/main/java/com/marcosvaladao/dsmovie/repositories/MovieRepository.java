package com.marcosvaladao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosvaladao.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}