package com.wipro.gow.quizappmonorepo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.gow.quizappmonorepo.questions.Quiz;

public interface QuizReopository extends JpaRepository<Quiz, Integer> {

	Optional<Quiz> getById(Long id);

	
}
