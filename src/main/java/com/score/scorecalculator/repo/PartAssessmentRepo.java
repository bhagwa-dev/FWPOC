package com.score.scorecalculator.repo;

import com.score.scorecalculator.domain.PartAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "partAssessment", path = "partAssessment")
public interface PartAssessmentRepo extends JpaRepository<PartAssessment,Long> {
}
