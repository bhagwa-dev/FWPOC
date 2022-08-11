package com.score.scorecalculator.repo;

import com.score.scorecalculator.domain.FWAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface FWAnswerRepo extends JpaRepository<FWAnswers,Long> {
}