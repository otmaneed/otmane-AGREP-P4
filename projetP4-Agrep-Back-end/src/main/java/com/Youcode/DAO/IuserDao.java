package com.Youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Youcode.Entité.User;

public interface IuserDao extends JpaRepository<User, Integer>{
	public User findByUsername(String nom);
}
