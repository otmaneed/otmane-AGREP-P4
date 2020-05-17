package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Iinfermier;
import com.Youcode.Entité.Infermier;

@Service
public class InfermierService implements IinfermierService {
	
@Autowired Iinfermier infermier;
@Autowired
PasswordEncoder passwordencoder; 


@Override
public void insertinfermier(Infermier infermierr) {
	infermierr.setPassword(passwordencoder.encode(infermierr.getPassword()));
	infermier.save( infermierr);
  } 
  

@Override
public List <Infermier> selectinfermier(){
 	  return infermier.findAll();  
 	  
   }
  
 

@Override
public void deleteinfermier(int id_inf ) {
	infermier.deleteById(id_inf); 
   } 

@Override
public void updateinfermier(Infermier infermierr) {
	 infermier.save(infermierr); 
   }


@Override
public Optional<Infermier>  getinfermier(int id_inf){
 	 return infermier.findById(id_inf);  
   }

}
