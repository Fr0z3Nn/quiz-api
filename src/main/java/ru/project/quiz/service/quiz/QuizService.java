package ru.project.quiz.service.quiz;

import org.springframework.web.bind.annotation.RequestParam;
import ru.project.quiz.domain.dto.quiz.QuizDTO;

public interface QuizService {
    QuizDTO createQuiz (int numberOfQuestions);
    void finishQuiz ( Long id);
}
