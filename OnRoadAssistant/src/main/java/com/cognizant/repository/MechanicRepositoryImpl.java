package com.cognizant.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Mechanic;

@Repository("mechanicRepository")
public class MechanicRepositoryImpl implements MechanicRepository {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.cognizant.repository.MechanicRepository#save(com.cognizant.model.Mechanic)
	 */
	@Override
	public Mechanic save(Mechanic mechanic){
		entityManager.persist(mechanic);
		entityManager.flush();
		return mechanic;
	}

}
