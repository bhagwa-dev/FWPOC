package com.score.scorecalculator.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ParticipantAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long partId;
    private Long assessmentId;
    private Integer wellnessScore;
    private Boolean status;
    private Date createdDate=new Date();
    private Date modifyDate=new Date();
    private String dryFlag;
}
