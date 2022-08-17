package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class SavePerson {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("Ravi");
		person.setAge(25);

		Pan pan = new Pan();
		pan.setPanNum("SKDNR8389L");
		pan.setFatherName("Kannan");

		// where we placing the join column annotation in that we have to set.
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("---data Stored---");
	}

}
