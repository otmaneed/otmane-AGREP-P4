package com.Youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Youcode.Entité.Administartion;
import com.Youcode.Services.IAdministrationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdministrationController {
@Autowired 
IAdministrationService adminservice;

//	@GetMapping("/Admin")
//	public List <Administartion> getAll(){
//		List <Administartion> LP= adminservice.selectAdmin();
//		return LA;
//	}
//ajoute admin
@PostMapping(value = "/login/admin")
public Administartion ajoute(@RequestBody Administartion admin) {
adminservice.insertadmin(admin);
return admin;
}
//selection de tous les disponibilite
@GetMapping("/admin")
public List<Administartion> selectTousAdmin(){
return adminservice.selectadmin();
}
	@GetMapping("/admin/{id}")
	public Administartion SelectById (@PathVariable("id") int id_administartion) {
	Administartion admin = adminservice.getAdmin(id_administartion).get();
	return admin ;
	}
//modifier admin
@PutMapping("/admin/{id}")
public Administartion modifierAdmin(@RequestBody Administartion a, @PathVariable("id") int id) {
a.setId(id);
adminservice.insertadmin(a);
return a;
}
//suprimier admin
@DeleteMapping(value= "/admin/{id}")
public void suprimierAdminId(@PathVariable("id") int id) {
adminservice.deleteAdmin(id);
}
}
