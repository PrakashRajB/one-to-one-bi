package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class GetGstById {
	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst=entityManager.find(Gst.class, 2);
		System.out.println(gst);
		System.out.println("------------------------------");
		Thread.sleep(2000);
		Company company=gst.getCompany();
		System.out.println(company);
	}

}
