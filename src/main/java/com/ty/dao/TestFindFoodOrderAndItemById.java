package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;

public class TestFindFoodOrderAndItemById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		FoodOrder fo = em.find(FoodOrder.class, 1);
		System.out.println("------Food Order Info------");
		System.out.println("ID is : "+fo.getId());
		System.out.println("Placed by : "+fo.getPlacedBy());
		System.out.println("Status of order : "+fo.getStatus());
		System.out.println("Items contained : "+fo.getItems());
	}
}