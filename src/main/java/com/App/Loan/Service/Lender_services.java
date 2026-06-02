package com.App.Loan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.Loan.Entities.Borrower;
import com.App.Loan.Repository.Borrower_repo;

@Service
public class Lender_services {

	@Autowired
	private Borrower_repo borrower_repo;

	public List<Borrower> getAllBorrowers(Long lenderId) {
		return borrower_repo.findBorrowersByLenderId(lenderId);
	}
}
