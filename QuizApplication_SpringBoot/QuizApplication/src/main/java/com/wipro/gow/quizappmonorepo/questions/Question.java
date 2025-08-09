package com.wipro.gow.quizappmonorepo.questions;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


	@NotBlank
    private String questionTitle;
    @NotBlank
    private String option1;
    @NotBlank
    private String option2;
    @NotBlank
    private String option3;
    @NotBlank
    private String option4;

    @NotBlank
    private String correctAnswer;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    @Enumerated(EnumType.STRING)
    private Category category;

	public Long getQuestionID() {
		// TODO Auto-generated method stub
		return null;
	}

	    
}
