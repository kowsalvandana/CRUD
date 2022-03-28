package com.sree.service;

import java.util.List;

import com.sree.model.ContactDetails;

public interface ContactDetailsService {
public Integer saveContactDetails(ContactDetails cd);
public List<ContactDetails> getAllContactDetails();
public void deleteContact(Integer id);
public ContactDetails getOneContact(Integer id);

}
