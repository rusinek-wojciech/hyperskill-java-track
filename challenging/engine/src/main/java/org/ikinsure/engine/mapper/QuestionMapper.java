package org.ikinsure.engine.mapper;

import org.ikinsure.engine.dto.QuestionGetDto;
import org.ikinsure.engine.dto.QuestionPostDto;
import org.ikinsure.engine.model.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {

    public Question questionPostDtoToQuestion(Integer id,
                                             QuestionPostDto questionCreateDto) {
        return new Question(
                id,
                questionCreateDto.getTitle(),
                questionCreateDto.getText(),
                questionCreateDto.getOptions(),
                questionCreateDto.getAnswer());
    }

    public QuestionGetDto questionToQuestionGetDto(Question question) {
        return new QuestionGetDto(
                question.getId(),
                question.getTitle(),
                question.getText(),
                question.getOptions());
    }
}
