package com.sree.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.ContactDetails;
import com.sree.service.ContactDetailsService;

@RestController
@RequestMapping("/contact")
public class ContactDetailsRestController {

	@Autowired
	private ContactDetailsService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveContact(@RequestBody ContactDetails cd){
		Integer id=service.saveContactDetails(cd);
		return new ResponseEntity<String>("Contact Save"+id+"Succussfully",HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<ContactDetails>> getAllContacts(){
		List list=service.getAllContactDetails();
		return new ResponseEntity<List<ContactDetails>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable Integer id){
		service.deleteContact(id);
		return new ResponseEntity<String>("ContactDeleted",HttpStatus.OK);
	}
	@GetMapping("/one/{id}")
	public ResponseEntity<ContactDetails> getOneContact(@PathVariable Integer id){
		ContactDetails cd=service.getOneContact(id);
		return new ResponseEntity<ContactDetails>(cd,HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateContact(@PathVariable Integer id,@RequestBody ContactDetails contactdetails){
		ContactDetails cd=service.getOneContact(id);
		cd.setName(contactdetails.getName());
		cd.setEmail(contactdetails.getEmail());
		cd.setPhno(contactdetails.getPhno());
		service.saveContactDetails(cd);
		return new ResponseEntity<String>("Contact Updated",HttpStatus.OK);
	}
}

