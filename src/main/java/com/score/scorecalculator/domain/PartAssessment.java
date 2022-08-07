package com.score.scorecalculator.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class PartAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long partAssId;
    private Long questionId;
    private Long answerId;
}
