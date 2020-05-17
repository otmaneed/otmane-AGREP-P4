package com.Youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Youcode.Entité.Infermier;
import com.Youcode.Services.IinfermierService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class InfermierController {
	

	@Autowired IinfermierService infermierservice;
	 
	@GetMapping("/Infermier")
	public List <Infermier> getAll(){
		return infermierservice.selectinfermier();
		
	}
	
	@GetMapping("/Infermier/{id}")
	public Infermier SelectById (@PathVariable("id") int id) {
		Infermier infermier = infermierservice.getinfermier(id).get();
		return infermier;
		}
		
	@DeleteMapping("/Infermier/{id}")
	public void deleteInfermier(@PathVariable("id") int  id_inf) {
		infermierservice.deleteinfermier(id_inf);
	}
	
	@PostMapping("/login/Infermier")
	public void createInfermier(@RequestBody Infermier infermierr) {
		infermierservice.insertinfermier(infermierr);
	}

	 @PatchMapping("/Infermier/{id}")
	 public Infermier UpdateInfermier(@RequestBody Infermier infermierr,@PathVariable("id")int id){
		 infermierr.setId(id);
		 infermierservice.updateinfermier(infermierr);
		 return infermierr;
	 }
		

}
