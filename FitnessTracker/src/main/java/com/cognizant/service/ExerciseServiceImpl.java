package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.cognizant.service.ExerciseService#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setDesc("Hello From Activity");
		activities.add(activity);
		Activity activity1 = new Activity();
		activity1.setDesc("Hello From Activity1");
		activities.add(activity1);
		Activity activity2 = new Activity();
		activity2.setDesc("Hello From Activity2");
		activities.add(activity2);
		return activities;
	}
}
