package com.score.scorecalculator.domain;

import javax.persistence.*;

@Entity
@Table(name = "fw_answers")
public class FWAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long answerId;
    private String answerDesc;
    private String answerValue;
    private String answerOption;
}
