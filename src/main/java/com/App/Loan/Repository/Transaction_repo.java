package com.App.Loan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App.Loan.Entities.Transactions;

@Repository
public interface Transaction_repo extends JpaRepository<Transactions, Long> {

	List<Transactions> findByLenderId_Id(Long lenderId);
}
