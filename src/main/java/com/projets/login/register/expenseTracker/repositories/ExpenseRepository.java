package com.projets.login.register.expenseTracker.repositories;


import com.projets.login.register.expenseTracker.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {


}
