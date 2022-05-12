package com.marcosvaladao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosvaladao.dsmovie.entities.Score;
import com.marcosvaladao.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}