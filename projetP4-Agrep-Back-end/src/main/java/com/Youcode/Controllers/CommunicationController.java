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

import com.Youcode.Entité.Communication;
import com.Youcode.Services.ICommunicationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CommunicationController {
@Autowired private ICommunicationService communicationServie;
@GetMapping("/communications")
public List<Communication> getAll(){
	return communicationServie.selectcom();
}

@GetMapping("/communications/{id}")
public Communication SelectById (@PathVariable("id") int id_communication) {
	return communicationServie.getcom(id_communication);


}

@DeleteMapping("/communications/{id}")
public void deleteCommunication(@PathVariable("id") int id_communication) {
	communicationServie.deletecom(id_communication);
}
 
@PostMapping("/communications")
public void createCommunication(@RequestBody Communication communication) {
	communicationServie.insertcom(communication);
}

 @PatchMapping("/communications/{id}")
 public Communication UpdateCommunication(@RequestBody Communication communication, @PathVariable("id") int id){
	 communication.setId_communication(id);
	 communicationServie.insertcom(communication);
	 return communication;
 }
}
