package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.beans.Person;

public class PersonDaoImpl implements PersonDao{

	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void save(Person p) {
		Session s=sf.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.persist(p);
		t.commit();
		s.close();
	}

	public List<Person> list() {
		Session s=sf.openSession();
		List<Person> plist=s.createQuery("from Person p").list();
		s.close();
		return plist;
	}

	
}
