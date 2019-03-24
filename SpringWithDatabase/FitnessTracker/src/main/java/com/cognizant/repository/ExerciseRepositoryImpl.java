package com.cognizant.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Exercise save(Exercise exercise) {
		// TODO Auto-generated method stub
		entityManager.persist(exercise);
		entityManager.flush();
		return exercise;
	}

}
