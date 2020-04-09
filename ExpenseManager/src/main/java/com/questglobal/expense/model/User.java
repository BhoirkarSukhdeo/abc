package com.questglobal.expense.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	@Column(name="userName")
	@NotEmpty(message = "Name Not Empty ")
	private String userName;
	
	
	@Column(name="userAddress")
	@NotEmpty(message = "Address Not Empty ")
	private String userAddress;
	
	
	@Column(name="userEmail")
	@Email(message = "@gmail.com")
	@NotEmpty(message = "Email Not Empty ")
	private String userEmail;
	
	@Column(name="userPassword")
	@NotEmpty(message = "Password Not Empty ")
	private String userPassword;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private List<Expense> expenseList;
	
private int m;
	
}
