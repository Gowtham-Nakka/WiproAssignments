package com.wipro.gow.quizappmonorepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.gow.quizappmonorepo.questions.Question;
import com.wipro.gow.quizappmonorepo.services.QuestionService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

	@Autowired
    private QuestionService questionService;

    @PostMapping("/addNewQuestion")
    public Question createQuestion( @Valid @RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("/getQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/getQuestionByID/{id}") 
    public Question getQuestionById( @Valid @PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public void deleteQuestion( @Valid @PathVariable Long id) {
        questionService.deleteQuestion(id);
    }
    
    @PatchMapping("/patchQuestion/{id}")
    public void patchQuestion( @Valid @PathVariable Long id) {
        questionService.patchQuestion(id);
    }
}
