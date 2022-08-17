package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class SaveCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("MSD solutions");
		company.setAddress("Chennai");

		Gst gst = new Gst();
		gst.setGstNo("mdh3241");
		gst.setStatus("Active");

		company.setGst(gst);

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
