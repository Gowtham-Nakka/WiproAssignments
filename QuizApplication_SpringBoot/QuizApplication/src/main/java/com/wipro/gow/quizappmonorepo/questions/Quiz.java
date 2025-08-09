package com.wipro.gow.quizappmonorepo.questions;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String category;
    private String level;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Question> questions;

	public Object getDifficultyLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDifficultyLevel1(Object difficultyLevel) {
		// TODO Auto-generated method stub
		
	}

	public void setDifficultyLevel(Object difficultyLevel) {
		// TODO Auto-generated method stub
		
	}
}
