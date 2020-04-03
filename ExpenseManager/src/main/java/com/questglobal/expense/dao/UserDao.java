package com.questglobal.expense.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questglobal.expense.model.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
