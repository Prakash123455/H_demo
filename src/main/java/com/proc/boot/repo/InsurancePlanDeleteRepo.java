package com.proc.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proc.boot.model.InsurancePlanDetails;


public interface InsurancePlanDeleteRepo extends JpaRepository<InsurancePlanDetails, Integer> 
{


}
