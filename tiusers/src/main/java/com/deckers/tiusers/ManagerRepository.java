package com.deckers.tiusers;

import org.springframework.data.repository.CrudRepository;
import com.deckers.tiusers.Manager;
public interface ManagerRepository  extends  CrudRepository<Manager ,Integer> {
	Iterable<Manager> listbyfirstname(String Firstname);
}
