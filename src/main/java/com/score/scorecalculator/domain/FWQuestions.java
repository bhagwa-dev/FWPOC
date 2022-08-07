package com.score.scorecalculator.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fw_questions")
@Data
public class FWQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;
    private String questionDesc;
    private String questionType;
}
