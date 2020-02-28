package com.bridgelabz.userManagement.businessLgic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.bridgelabz.userManagement.model.User;

@Stateless
public class BusinessLogic {

	@PersistenceContext(unitName = "JPADB")
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADB");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public BusinessLogic() {
	}

	public User login(String user, String password) {

		User consumer = entityManager.find(User.class, user);
		if (consumer.getPassword().equals(password))
			return consumer;
		else
			return new User();
	}

	public void deleteUser(User user) {
		User consumer = entityManager.find(User.class, user.getUser());
		entityManager.remove(consumer);
	}

	public void addUser(User user) {

		entityManager.persist(user);
	}

}
