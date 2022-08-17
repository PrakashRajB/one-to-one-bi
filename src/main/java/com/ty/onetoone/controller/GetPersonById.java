package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class GetPersonById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		System.out.println("Person id - " + person.getId());
		System.out.println("Person Name - " + person.getName());
		System.out.println("Person Age - " + person.getAge());
		System.out.println("--------------------------------");

//		Pan pan = person.getPan();
//		if (pan != null) {
//			System.out.println("Pan id - " + pan.getId());
//			System.out.println("Pan Number - " + pan.getPanNum());
//			System.out.println("Father Name in Pan - " + pan.getFatherName());
//		}

	}

}
