package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class GetPanById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		System.out.println("Pan Number - " + pan.getPanNum());
		System.out.println("Pan id - " + pan.getId());
		System.out.println("father name in Pan - " + pan.getFatherName());
		System.out.println("---------------------------------");

//		Person person = pan.getPerson();
//		if (person != null) {
//			System.out.println("Person id - " + person.getId());
//			System.out.println("person Name - " + person.getName());
//			System.out.println("Person Age - " + person.getAge());
//		}

	}

}
