package com.score.scorecalculator.repo;

import com.score.scorecalculator.domain.FWAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "answers", path = "answers")
public interface FWAnswerRepo extends JpaRepository<FWAnswers,Long> {
}