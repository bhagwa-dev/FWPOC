package com.score.scorecalculator.repo;

import com.score.scorecalculator.domain.FWQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FWQuestionsRepo  extends JpaRepository<FWQuestions,Long> {
    Optional<FWQuestions> findByQuestionType(String type);
}
