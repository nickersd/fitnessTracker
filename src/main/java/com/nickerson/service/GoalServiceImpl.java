package com.nickerson.service;

import com.nickerson.model.Goal;
import com.nickerson.model.GoalReport;
import com.nickerson.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dnickerson on 4/6/2017.
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    //For mockito test
    public void setGoalRepository(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Transactional
    public Goal save(Goal goal) {

        goalRepository.save(goal);
        return goal;
    }


    public List<Goal> findAllGoals() {

        return goalRepository.findAll();
    }

    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }
}
