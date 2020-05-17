package com.Youcode.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.IuserDao;
import com.Youcode.Entité.User;
@Service
public class UserService implements IuserService{
	@Autowired
	private IuserDao serviceUtilisateur;
	public User findByUsername(String nom) {
		return serviceUtilisateur.findByUsername(nom);
	}
}
