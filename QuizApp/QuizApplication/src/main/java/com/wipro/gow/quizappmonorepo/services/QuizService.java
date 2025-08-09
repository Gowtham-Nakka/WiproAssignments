package com.wipro.gow.quizappmonorepo.services;

import java.util.List;

import com.wipro.gow.quizappmonorepo.questions.QuestionWrapper;
import com.wipro.gow.quizappmonorepo.questions.Quiz;
import com.wipro.gow.quizappmonorepo.questions.Response;

public interface QuizService {
    Quiz createQuiz(Quiz quiz);
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(Long id);
    Quiz updateQuiz(Long id, Quiz updatedQuiz);
    void deleteQuiz(Long id);
   
	int calculateScore(Long quizId, List<Long> selectedOptionIds);
	List<QuestionWrapper> getQuizQuestions(Integer id);
	Integer calculateResult(int id, List<Response> responses);
	List<QuestionWrapper> getQuizQuestion(Integer id);
}
