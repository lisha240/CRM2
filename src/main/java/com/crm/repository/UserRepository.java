package com.crm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crm.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

      User findByEmailIgnoreCase(String username);

	

}
