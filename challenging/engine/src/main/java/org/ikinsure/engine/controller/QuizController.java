package org.ikinsure.engine.controller;

import org.ikinsure.engine.dto.AnswerGetDto;
import org.ikinsure.engine.dto.AnswerPostDto;
import org.ikinsure.engine.dto.QuestionPostDto;
import org.ikinsure.engine.dto.QuestionGetDto;
import org.ikinsure.engine.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("api")
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("quizzes")
    public QuestionGetDto createQuestion(
            @RequestBody @Valid QuestionPostDto questionCreateDto) {
        return quizService.createQuestion(questionCreateDto);
    }

    @PostMapping("quizzes/{id}/solve")
    public AnswerGetDto solveQuestion(@PathVariable Integer id,
                                      @RequestBody @Valid AnswerPostDto answerPostDto) {
        return quizService.solveQuestion(id, answerPostDto);
    }

    @GetMapping("quizzes/{id}")
    public QuestionGetDto findQuestionById(@PathVariable Integer id) {
        return quizService.findQuestionById(id);
    }

    @GetMapping("quizzes")
    public List<QuestionGetDto> getQuestions() {
        return quizService.getQuestions();
    }

}
