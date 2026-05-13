package com.App.Loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.App.Loan.Entities.Borrower;
import com.App.Loan.Entities.Lender;
import com.App.Loan.Entities.Transactions;
import com.App.Loan.Repository.Borrower_repo;
import com.App.Loan.Repository.Lender_repo;
import com.App.Loan.Repository.Transaction_repo;
import com.App.Loan.Service.Lender_services;

@RestController
public class Testing {

	@Autowired
	private Transaction_repo transaction_repo;
	@Autowired
	private Lender_repo lender_repo;
	@Autowired
	private Borrower_repo borrower_repo;
	@Autowired
	private Lender_services lender_services;

	@GetMapping("/")
	public String getMethodName() {
		return new String("kaam to kar rahah hai");
	}

	@PostMapping("/Transaction")
	public Transactions postTransaction(@RequestBody Transactions body) {
		return transaction_repo.save(body);
	}

	@PostMapping("/Lender")
	public Lender postLender(@RequestBody Lender body) {
		// return lender_repo.save(body);
        return body;
	}

	@PostMapping("/Borrower")
	public Borrower postBorrower(@RequestBody Borrower body) {
		return borrower_repo.save(body);
	}

	@GetMapping("/Transactions")
	public List<Borrower> getBorrowersByLender(@RequestParam Long lenderId) {
		return lender_services.getAllBorrowers(lenderId);
	}
}
