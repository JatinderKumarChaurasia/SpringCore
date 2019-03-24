package com.cognizant.services;

import java.util.List;

import com.cognizant.model.Goal;
import com.cognizant.model.GoalReport;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> getGoalReport();

}
