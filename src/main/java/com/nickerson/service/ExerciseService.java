package com.nickerson.service;

import java.util.List;

import com.nickerson.model.Activity;
import com.nickerson.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}