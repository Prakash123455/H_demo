package com.proc.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proc.boot.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> 
{

}
