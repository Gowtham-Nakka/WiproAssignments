package com.wipro.gow.quizappmonorepo.services;

import java.util.List;
import java.util.Map;

import com.wipro.gow.quizappmonorepo.questions.Question;

public interface QuestionService {

	 Question addQuestion(Question question);
	    List<Question> getAllQuestions();
	    Question getQuestionById(Long id);
	    String deleteQuestion(Long id);
		void patchQuestion(Long id);
		Question updateQuestion(Long id, Question updatedQuestion);
		int calculateScore(Map<Long, String> userAnswers);
				
}
