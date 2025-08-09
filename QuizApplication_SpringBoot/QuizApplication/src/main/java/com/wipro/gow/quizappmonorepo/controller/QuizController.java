package com.wipro.gow.quizappmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.gow.quizappmonorepo.questions.QuestionWrapper;
import com.wipro.gow.quizappmonorepo.questions.Quiz;
import com.wipro.gow.quizappmonorepo.questions.Response;
import com.wipro.gow.quizappmonorepo.services.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/quiz")
public class QuizController {
 
	@Autowired
	private final QuizService quizService;
	
	@PostMapping("/createQuiz")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.createQuiz(quiz);
    }

	
	@GetMapping("/getQuizById/{id}")
	public List<QuestionWrapper> getQuizQuestion(@PathVariable Integer id)
	{
		return quizService.getQuizQuestion(id);
	}
	
	@PostMapping("/submitQuiz/{id}")
	public Integer submitQuiz(@PathVariable int id, @RequestBody List<Response> responses) {
		return quizService.calculateResult(id,responses);
		
		

}
}
