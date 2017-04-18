package com.nickerson.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="goals")
public class Goal {

	public static final String FIND_GOAL_REPORTS = "findGoalReports";
	@Id @GeneratedValue
	@Column(name="GOAL_ID")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name="MINUTES")
	private Integer minutes = 0;

	@OneToMany(mappedBy="goal", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Exercise> exercises = new ArrayList<Exercise>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, minutes, exercises);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		final Goal other = (Goal) obj;
		return Objects.equals(this.id, other.id)
				&& Objects.equals(this.minutes, other.minutes)
				&& Objects.equals(this.exercises, other.exercises);
	}
}
