package com.App.Loan.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "lender_id")
    private Lender lenderId;
    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrowerId;
    private double amount;
    private String status;
    private String date;
    private double InterestRate;
    private double LoanTerm;
}