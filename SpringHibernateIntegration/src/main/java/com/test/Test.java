package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Person;
import com.dao.PersonDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao pad=ap.getBean(PersonDao.class);
		Person p=new Person();
		p.setId(1);
		p.setName("yogi");
		p.setCountry("India");
		pad.save(p);
		System.out.println("person:: "+p);
		List<Person> pl=pad.list();
		for (Person person : pl) {
			System.out.println("person list::"+person);
		}
		//ap.close();
	}

}
