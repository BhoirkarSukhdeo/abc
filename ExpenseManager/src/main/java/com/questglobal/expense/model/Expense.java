package com.questglobal.expense.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int expenseId;
	
	private String expenseTitle;
    private String description;
    
	private float amount;
	
	private Date date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "expenseId")
	private List<Category> category;
	
	

}
