package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Integer>{

}
