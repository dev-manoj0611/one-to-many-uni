package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class TestFoodOrderSave {

	public static void main(String[] args) {
		FoodOrder fo = new FoodOrder();
		List<Item> items = new ArrayList();
		fo.setPlacedBy("manoj");
		fo.setStatus("served");
		Item i = new Item();
		i.setName("dosa");
		i.setQuantity(1);
		i.setCost(50);
		Item i2 = new Item();
		i2.setName("chatni");
		i2.setQuantity(2);
		i2.setCost(10);
		Item i3 = new Item();
		i3.setName("idli");
		i3.setQuantity(1);
		i3.setCost(10);
		List l = new ArrayList();
		l.add(i);
		l.add(i2);
		l.add(i3);
		fo.setItems(l);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(fo);
		em.persist(i);
		em.persist(i2);
		em.persist(i3);
		et.commit();
	}
}