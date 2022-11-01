package com.score.scorecalculator;

import com.score.scorecalculator.domain.FWQuestions;
import com.score.scorecalculator.repo.FWAnswerRepo;
import com.score.scorecalculator.repo.FWQuestionsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Locale;


@SpringBootApplication


public class ScoreCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoreCalculatorApplication.class, args);
	}

	@Autowired
	FWQuestionsRepo fwQuestionsRepo;
	@Autowired
	FWAnswerRepo answerRepo;
	@Bean
	public void fillData(){
		FWQuestions fwQuestions=new FWQuestions();
		fwQuestions.setQuestionDesc("Question 1");
		fwQuestionsRepo.save(fwQuestions);
		FWQuestions fwQuestions2=new FWQuestions();
		fwQuestions2.setQuestionDesc("Question 2");
		fwQuestionsRepo.save(fwQuestions2);
		FWQuestions fwQuestions3=new FWQuestions();
		fwQuestions3.setQuestionDesc("Question 3");
		fwQuestionsRepo.save(fwQuestions3);
		FWQuestions fwQuestions4=new FWQuestions();
		fwQuestions4.setQuestionDesc("Question 4");
		fwQuestionsRepo.save(fwQuestions4);
	}
}
