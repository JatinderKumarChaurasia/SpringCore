package com.cognizant.repository;

import java.util.List;

import com.cognizant.model.Goal;
import com.cognizant.model.GoalReport;

public interface GoalRepository {
	
	Goal save(Goal goal);

	List<Goal> getAllGoals();

	List<GoalReport> getGoalReport();


	
}
