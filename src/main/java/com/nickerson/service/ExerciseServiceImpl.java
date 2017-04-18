package com.nickerson.service;

import java.util.ArrayList;
import java.util.List;

import com.nickerson.model.Exercise;
import com.nickerson.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nickerson.model.Activity;
import org.springframework.transaction.annotation.Transactional;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;

	public void setExerciseRepository( ExerciseRepository exerciseRepository){ this.exerciseRepository = exerciseRepository; }


	@Transactional
	public Exercise save(Exercise exercise) {
		exerciseRepository.save(exercise);
		return exercise;
	}

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
	
}
