package com.sree.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sree.model.UserDtls;

@Repository
public interface UserDtlsRepository extends CrudRepository<UserDtls, Integer> {

}
