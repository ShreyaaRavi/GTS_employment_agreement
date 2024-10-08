package com.project.gts.project.repositories;

import com.project.gts.project.entities.EmploymentAgreementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentAgreementRepository extends JpaRepository<EmploymentAgreementEntity, Long> {

}


