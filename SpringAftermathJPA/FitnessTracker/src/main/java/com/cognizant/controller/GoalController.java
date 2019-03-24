package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cognizant.model.Goal;
import com.cognizant.model.GoalReport;
import com.cognizant.services.GoalService;


@Controller
@SessionAttributes(value= {"goal"})
public class GoalController {

	/*
	 * // @RequestMapping(value="addGoal" , method= RequestMethod.GET)
	 * // @RequestMapping(value="addGoal" , method= RequestMethod.POST) public
	 * String addGoal(Model model) { model.addAttribute("goal",new Goal()); return
	 * "addGoal"; } 
	 * 
	 */
	
	@Autowired
	private GoalService goalService;
	
	@RequestMapping(value="addGoal" , method= RequestMethod.GET)
	public String addGoal(Model model,HttpSession session) {
		
		//Goal goal = new Goal();
		Goal goal = (Goal) session.getAttribute("goal");
		if(goal == null) {
			goal = new Goal();
			goal.setMinutes(10);
		}
		model.addAttribute("goal",goal);
		return "addGoal";
	}
	@RequestMapping(value="addGoal" , method= RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal,BindingResult result) {
		System.out.println("Result has Error: "+result.hasErrors());
		System.out.println("You Entered:"+goal.getMinutes());
		if(result.hasErrors() == true) {
			return "addGoal";
		}else {
			goalService.save(goal);
		}
		//return "redirect:addMinutes.html";

		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="getGoal",method=RequestMethod.GET)
	public String getGoals(Model model) {
		List<Goal> goals = goalService.findAllGoals();
		model.addAttribute("goals",goals);
		return "getGoals";
	}
	
	@RequestMapping(value="getGoalReport",method=RequestMethod.GET)
	public String getGoalReport(Model model) {
		List<GoalReport> goals = goalService.getGoalReport();
		model.addAttribute("goalReports",goals);
		return "getGoalReport";
		
	}
}
//To store Attribute in session we use
//@SessionAttribute