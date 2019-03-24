package com.cognizant.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Goal;
import com.cognizant.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Goal save(Goal goal) {
		entityManager.persist(goal);
		entityManager.flush();
		return goal;
	}
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Goal> getAllGoals() {
		//Query query = entityManager.createQuery("Select g from Goal g");
        TypedQuery<Goal> query = entityManager.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
		
		return query.getResultList();
		//List goals = query.getResultList();
		
		//return goals;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<GoalReport> getGoalReport() {
		
		/*// We are using NamedQueries in place of that query in specified domain
		Query query = entityManager.createQuery("Select new com.cognizant.model.GoalReport(g.minutes,e.minutes,e.activity)"+
	"from Goal g,Exercise e where g.id= e.goal.id");
	*/
		TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORTS,GoalReport.class);
		List goalReport = query.getResultList();
		return goalReport;
	}

}
