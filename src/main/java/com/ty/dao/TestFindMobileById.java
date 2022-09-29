package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;

public class TestFindMobileById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Mobile m = em.find(Mobile.class, 1);
		System.out.println("---------Mobile info---------");
		System.out.println("Mobile name is : " + m.getName());
		System.out.println("Mobile cost is : " + m.getCost());
		System.out.println("Mobile id is : " + m.getId());
		List l = m.getSims();
		System.out.println("---Mobile with sim card info---");
		System.out.println(l);
	}
}