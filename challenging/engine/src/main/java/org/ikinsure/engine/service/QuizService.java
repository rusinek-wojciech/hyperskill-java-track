package org.ikinsure.engine.service;

import org.ikinsure.engine.dto.AnswerGetDto;
import org.ikinsure.engine.dto.AnswerPostDto;
import org.ikinsure.engine.dto.QuestionPostDto;
import org.ikinsure.engine.dto.QuestionGetDto;
import org.ikinsure.engine.mapper.QuestionMapper;
import org.ikinsure.engine.model.Question;
import org.ikinsure.engine.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    @Autowired
    public QuizService(QuestionRepository questionRepository,
                       QuestionMapper questionMapper) {
        this.questionRepository = questionRepository;
        this.questionMapper = questionMapper;
    }

    public QuestionGetDto createQuestion(QuestionPostDto questionCreateDto) {
        Question question = questionMapper.questionPostDtoToQuestion(
                questionRepository.searchMissingId(),
                questionCreateDto);
        questionRepository.save(question);
        return questionMapper.questionToQuestionGetDto(question);
    }

    public QuestionGetDto findQuestionById(Integer id) {
        Question question = questionRepository
                .findFirstById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return questionMapper.questionToQuestionGetDto(question);
    }

    public AnswerGetDto solveQuestion(Integer id, AnswerPostDto answerPostDto) {
        Question question = questionRepository
                .findFirstById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        List<Integer> answers = answerPostDto.getAnswer();
        List<Integer> correctAnswers = question.getAnswers();
        Collections.sort(answers);
        Collections.sort(correctAnswers);
        return correctAnswers.equals(answers) ? AnswerGetDto.CORRECT : AnswerGetDto.WRONG;
    }

    public List<QuestionGetDto> getQuestions() {
        return questionRepository.getAll().stream()
                .map(questionMapper::questionToQuestionGetDto)
                .collect(Collectors.toList());
    }

}
