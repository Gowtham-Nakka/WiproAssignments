package com.wipro.gow.quizappmonorepo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.gow.quizappmonorepo.questions.Question;
import com.wipro.gow.quizappmonorepo.questions.QuestionWrapper;
import com.wipro.gow.quizappmonorepo.questions.Quiz;
import com.wipro.gow.quizappmonorepo.questions.Response;
import com.wipro.gow.quizappmonorepo.repository.QuizReopository;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizReopository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(Long id) {
        return quizRepository.getById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with ID: " + id));
    }

    @Override
    public Quiz updateQuiz(Long id, Quiz updatedQuiz) {
        Quiz quiz = quizRepository.getById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with ID: " + id));

        quiz.setTitle(updatedQuiz.getTitle());
        quiz.setCategory(updatedQuiz.getCategory());
        quiz.setDifficultyLevel(updatedQuiz.getDifficultyLevel());
        return quizRepository.save(quiz);
    }

    @Override
    public void deleteQuiz(Long id) {
        Quiz quiz = quizRepository.getById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with ID: " + id));
        quizRepository.delete(quiz);
    }

    @Override
    public int calculateScore(Long quizId, List<Long> selectedOptionIds) {
        // implementation logic
        return 0;
    }

    @Override
    public List<QuestionWrapper> getQuizQuestions(Integer id) {
        Quiz quiz = quizRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Quiz not found with ID: " + id));

        List<Question> questions = quiz.getQuestions();

        List<QuestionWrapper> wrappers = new ArrayList<>();
        for (Question q : questions) {
            QuestionWrapper qw = new QuestionWrapper();
            qw.setId(q.getId());
            qw.setQuestionTitle(q.getQuestionTitle());
            qw.setOption1(q.getOption1());
            qw.setOption2(q.getOption2());
            qw.setOption3(q.getOption3());
            qw.setOption4(q.getOption4());

            wrappers.add(qw);
        }
        return wrappers;
    }

	@Override
	public Integer calculateResult(int id, List<Response> responses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionWrapper> getQuizQuestion(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
