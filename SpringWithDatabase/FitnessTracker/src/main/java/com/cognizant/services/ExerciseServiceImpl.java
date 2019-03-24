package com.cognizant.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Activity;
import com.cognizant.model.Exercise;
import com.cognizant.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {
	
	@Autowired
	private ExerciseRepository exerciseRepository;

	/* (non-Javadoc)
	 * @see com.cognizant.services.ExerciseService#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();

		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);

		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);

		return activities;
	}

	@Transactional
	@Override
	public Exercise save( Exercise exercise) {
		
		exercise=exerciseRepository.save(exercise);
		return exercise;
		// TODO Auto-generated method stub
		
	}
}
