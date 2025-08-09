package com.wipro.gow.quizappmonorepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wipro.gow.quizappmonorepo.questions.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
 
	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.digfficulty_level = :difficulty ORDER BY RAND() LIMIT 3", nativeQuery=true)
	
	List<Question> findRandomQuestionsByCategoryAndLevel(String category, String difficulty);
}
