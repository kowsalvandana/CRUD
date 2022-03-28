package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.ContactDetails;

public interface ContactDetailsRepo extends JpaRepository<ContactDetails,Integer> {

}
