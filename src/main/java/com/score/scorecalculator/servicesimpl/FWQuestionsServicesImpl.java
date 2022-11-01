package com.score.scorecalculator.servicesimpl;

import com.score.scorecalculator.domain.FWQuestions;
import com.score.scorecalculator.exceptions.MyResourceNotFoundException;
import com.score.scorecalculator.repo.FWQuestionsRepo;
import com.score.scorecalculator.services.FWQuestionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FWQuestionsServicesImpl implements FWQuestionsServices {
    @Autowired
    FWQuestionsRepo fwQuestionsRepo;
    @Override
    public FWQuestions add(FWQuestions fwQuestions) {
        return fwQuestionsRepo.save(fwQuestions);
    }

    @Override
    public Optional<FWQuestions> getById(Long id) {
        return fwQuestionsRepo.findById(id);
    }

    @Override
    public Optional<FWQuestions> getByQuestionType(String type) {
        return fwQuestionsRepo.findByQuestionType(type);
    }
}
