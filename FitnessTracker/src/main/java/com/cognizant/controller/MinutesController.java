package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.model.Activity;
import com.cognizant.model.Exercise;
import com.cognizant.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	// It will fins the specified Attribute -exercise in addMinutes.html
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("Exercise:" + exercise.getMinutes());
		System.out.println("Exercise:" + exercise.getActivity());

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
