package com.cognizant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Goal;
import com.cognizant.model.GoalReport;
import com.cognizant.repository.GoalRepository;

@Service(value="goalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	GoalRepository goalRepository;

	@Transactional
	@Override
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	@Override
	public List<Goal> findAllGoals() {
		// TODO Auto-generated method stub
		return goalRepository.getAllGoals();
	}

	@Override
	public List<GoalReport> getGoalReport() {
		return goalRepository.getGoalReport();
	}

}
