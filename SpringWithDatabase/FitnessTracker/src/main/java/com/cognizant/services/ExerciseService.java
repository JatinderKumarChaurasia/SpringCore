package com.cognizant.services;

import java.util.List;

import com.cognizant.model.Activity;
import com.cognizant.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save( Exercise exercise);

}