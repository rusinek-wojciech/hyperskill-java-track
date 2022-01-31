package org.ikinsure.engine.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AnswerPostDto {

    @NotNull
    private List<Integer> answer;

    public AnswerPostDto() {

    }

    public AnswerPostDto(List<Integer> answer) {
        this.answer = answer;
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Integer> answer) {
        this.answer = answer;
    }
}
