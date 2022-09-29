package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class TestSaveEntity {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setName("samsung");
		m.setProvider("airtel");
		m.setCost(500);
		Sim sim = new Sim();
		sim.setName("air10");
		sim.setProvider("airtel");
		Sim sim1 = new Sim();
		sim1.setName("air12");
		sim1.setProvider("airtel");
		List<Sim> sims = new ArrayList();
		sims.add(sim1);
		sims.add(sim);
		m.setSims(sims);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(m);
		em.persist(sim);
		em.persist(sim1);
		et.commit();
	}
}