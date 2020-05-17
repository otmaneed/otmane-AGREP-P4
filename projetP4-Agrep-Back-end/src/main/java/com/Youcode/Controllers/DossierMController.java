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

import com.Youcode.Entité.DossierM;
import com.Youcode.Services.IDossierMService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DossierMController {
@Autowired
	IDossierMService dossierm;

	@GetMapping("/DossierMd")
	
	public List <DossierM> getAll(){
		return 	 dossierm.selectdossier();
		
	}
	
	@GetMapping("/DossierMd/{id}")
	public DossierM SelectById (@PathVariable("id") int id_dossier) {
		return dossierm.getdossier(id_dossier).get();
		
		
	}
	@DeleteMapping("/DossierMd/{id}")
	
	public void deleteDossier(@PathVariable("id") int  id_dossier) {
	dossierm.deletedossier(id_dossier);
	}
	 
	@PostMapping("/DossierMd")
	public void createDossierM(@RequestBody DossierM dossier) {
		dossierm.insertdossier(dossier);
	}
	
	 @PatchMapping("/DossierMd/{id}")
	 public DossierM UpdateDossier(@RequestBody DossierM dossier,@PathVariable("id") int id){
		 dossier.setId_dossier(id);
		 dossierm.updatedossier(dossier);
		 
		 return dossier;
	 }

}
