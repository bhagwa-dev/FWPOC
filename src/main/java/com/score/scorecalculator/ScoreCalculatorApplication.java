package com.score.scorecalculator;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import java.util.Locale;


@SpringBootApplication


public class ScoreCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoreCalculatorApplication.class, args);
	}

}
