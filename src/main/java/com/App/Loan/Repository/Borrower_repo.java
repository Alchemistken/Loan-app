package com.App.Loan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.App.Loan.Entities.Borrower;

@Repository
public interface Borrower_repo extends JpaRepository<Borrower, Long> {

	@Query(value = "SELECT * FROM borrower WHERE id IN (SELECT borrower_id FROM transactions WHERE lender_id = :lenderId)", nativeQuery = true)
	List<Borrower> findBorrowersByLenderId(@Param("lenderId") Long lenderId);

	Borrower findByEmail(String email);
}
