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

import com.Youcode.Entité.Autre_resource;
import com.Youcode.Services.IAutre_ressourceService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Autre_ressourceController {
 @Autowired
 IAutre_ressourceService autrer;
 
	@GetMapping("/AutreR")
	public List <Autre_resource> getAll(){
		List <Autre_resource> Lres= autrer.selectresource();
		return Lres;
	}
	
	@GetMapping("/AutreR/{id}")
	public Autre_resource SelectById (@PathVariable("id") int id_Autre_resource) {
		Autre_resource rsc = autrer.getresource(id_Autre_resource).get();
		return rsc ;
	
	}
	
	@DeleteMapping("/AutreR/{id}")
	public void deleteresource(@PathVariable("id") int id_Autre_resource) {
	autrer.deleteresource(id_Autre_resource);
	}
	 
	@PostMapping("/AutreR")
	public void createresource(@RequestBody Autre_resource resource) {
		autrer.insertresource(resource);
	}
	
	 @PatchMapping("/AutreR/{id}")
	 public Autre_resource Updateresource(@RequestBody Autre_resource resource, @PathVariable("id") int id){
		 resource.setId(id);
		autrer.insertresource(resource);;
		 return resource;
	 }

}
