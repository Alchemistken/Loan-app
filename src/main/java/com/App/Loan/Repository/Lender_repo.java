package com.App.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.Loan.Entities.Lender;

@Repository
public interface Lender_repo extends JpaRepository<Lender, Long> {

	Lender findByEmail(String email);
}
