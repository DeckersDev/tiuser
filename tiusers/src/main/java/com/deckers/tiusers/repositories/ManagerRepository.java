package com.deckers.tiusers.repositories;

import org.springframework.data.repository.CrudRepository;

import com.deckers.tiusers.entities.Manager;
public interface ManagerRepository  extends  CrudRepository<Manager ,Long> {
	Iterable<Manager> findbyfirstname(String Firstname);
}
