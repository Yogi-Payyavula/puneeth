package com.dao;

import java.util.List;

import com.beans.Person;

public interface PersonDao {

	public void save(Person p);
	
	public List<Person> list();
}
