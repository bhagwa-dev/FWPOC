package com.score.scorecalculator.repo;

import com.score.scorecalculator.domain.FWQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "questions", path = "questions")
public interface FWQuestionsRepo  extends JpaRepository<FWQuestions,Long> {
}
