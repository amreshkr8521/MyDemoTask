package com.bridgelabz.userManagement.businessLgic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.bridgelabz.userManagement.model.Authorization;

@Stateless
public class PermissionBusiness {
	@PersistenceContext(unitName = "JPADB")
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADB");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void givePermission(Authorization permission) {
		entityManager.persist(permission);
	}
}
