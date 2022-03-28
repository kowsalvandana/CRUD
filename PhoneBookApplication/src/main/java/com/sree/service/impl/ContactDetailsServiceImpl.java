package com.sree.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.ContactDetails;
import com.sree.repo.ContactDetailsRepo;
import com.sree.service.ContactDetailsService;

@Service
public class ContactDetailsServiceImpl implements ContactDetailsService {
	
	@Autowired
	private ContactDetailsRepo repo;

	@Override
	public Integer saveContactDetails(ContactDetails cd) {
		
		return repo.save(cd).getId();
	}

	@Override
	public List<ContactDetails> getAllContactDetails() {
		
		return repo.findAll();
	}

	@Override
	public void deleteContact(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public ContactDetails getOneContact(Integer id) {
	   Optional<ContactDetails> opt=repo.findById(id);
	   
	   ContactDetails cd=opt.orElseThrow(()-> new ContactNotFoundException("Contact Not Exist")
				);
		return cd;
	}

}
