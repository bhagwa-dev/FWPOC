package com.score.scorecalculator.services;

import com.score.scorecalculator.domain.FWQuestions;

import java.util.Optional;

public interface FWQuestionsServices {
    FWQuestions add(FWQuestions fwQuestions);

    Optional<FWQuestions> getById(Long id);
}
