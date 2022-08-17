package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class GetCompanyById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Company company = entityManager.find(Company.class, 1);
		System.out.println(company);
		System.out.println("---------------------------------");
		Gst gst=company.getGst();
		System.out.println(gst);
	}

}
