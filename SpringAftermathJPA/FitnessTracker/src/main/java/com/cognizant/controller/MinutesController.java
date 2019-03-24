package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.model.Activity;
import com.cognizant.model.Exercise;
import com.cognizant.model.Goal;
import com.cognizant.services.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	/*// It will fins the specified Attribute -exercise in addMinutes.html
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("Exercise:" + exercise.getMinutes());
		System.out.println("Exercise:" + exercise.getActivity());

		return "addMinutes";
	}*/
	
	@RequestMapping(value="/addMinutes",method = RequestMethod.GET)
	public String  getMinutes(@ModelAttribute("exercise") Exercise exercise) {
		return "addMinutes";
		
	}
	
	@RequestMapping(value="/addMinutes",method=RequestMethod.POST)
	public String addMinutes(@Valid @ModelAttribute("exercise") Exercise exercise,HttpSession session,BindingResult result) {
		
		System.out.println("Exercise You Got:"+exercise.getMinutes());
		System.out.println("Exercise Activity:"+exercise.getActivity());
		if(result.hasErrors()) {
			return "addMinutes";
		}else {
			Goal goal = (Goal) session.getAttribute("goal");
			exercise.setGoal(goal);
			exerciseService.save(exercise);
		}
		return "addMinutes";
	}

	// Using Rest we need to include RequestMethod in our RequestMapping
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}

	// Channing
	/*
	 * @RequestMapping(value="/addMinutes") public String
	 * addMinutes(@ModelAttribute("exercise") Exercise exercise) {
	 * System.out.println("Exercise:"+exercise.getMinutes()); //It will forward the
	 * request to addMoreMinutes // return "forward:addMoreMinutes.html"; //redirect
	 * -> it will make a new request and lost old data return
	 * "redirect:addMoreMinutes.html"; }
	 * 
	 * @RequestMapping("/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
	 * System.out.println("Exercise More Minutes:"+exercise.getMinutes()); return
	 * "addMinutes";
	 * 
	 * }
	 */
}

