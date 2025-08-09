package com.wipro.gow.quizappmonorepo.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.gow.quizappmonorepo.questions.Question;
import com.wipro.gow.quizappmonorepo.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    // Create
    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    // Get All
    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    //  Get by ID
    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow();
    }

    //  Update (Full PUT)
    @Override
    public Question updateQuestion(Long id, Question updatedQuestion) {
        Question existing = questionRepository.findById(id)
                .orElseThrow();

        existing.setQuestionTitle(updatedQuestion.getQuestionTitle());
        existing.setOption1(updatedQuestion.getOption1());
        existing.setOption2(updatedQuestion.getOption2());
        existing.setOption3(updatedQuestion.getOption3());
        existing.setOption4(updatedQuestion.getOption4());
        existing.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
        existing.setDifficultyLevel(updatedQuestion.getDifficultyLevel());
        existing.setCategory(updatedQuestion.getCategory());

        return questionRepository.save(existing);
    }

    //  Delete
    @Override
    public String deleteQuestion(Long id) {
        Question question = questionRepository.findById(id)
                .orElseThrow();
        questionRepository.delete(question);
        return "Question deleted with ID: " + id;
    }

    //  Calculate Score
    @Override
    public int calculateScore(Map<Long, String> userAnswers) {
        int score = 0;
        for (Map.Entry<Long, String> entry : userAnswers.entrySet()) {
            Question question = questionRepository.findById(entry.getKey())
                    .orElseThrow();
            if (question.getCorrectAnswer().equalsIgnoreCase(entry.getValue())) {
                score++;
            }
        }
        return score;
    }

    // Patch (Partial Update or Toggle)
    @Override
    public void patchQuestion(Long id) {
        Question question = questionRepository.findById(id)
                .orElseThrow();

        // Example: Toggle correct answer to "option1" for testing purposes
        question.setCorrectAnswer("option1");

        questionRepository.save(question);
    }
}
