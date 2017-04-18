package com.nickerson.service;

import com.nickerson.model.Goal;
import com.nickerson.model.GoalReport;

import java.util.List;

/**
 * Created by dnickerson on 4/6/2017.
 */
public interface GoalService {

    public Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
