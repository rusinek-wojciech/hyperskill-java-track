package org.ikinsure.engine.dto;

public class AnswerGetDto {

    public static final AnswerGetDto CORRECT =
            new AnswerGetDto(true, "Congratulations, you're right!");
    public static final AnswerGetDto WRONG =
            new AnswerGetDto(false, "Wrong answer! Please, try again.");

    private Boolean success;
    private String feedback;

    public AnswerGetDto() {

    }

    public AnswerGetDto(Boolean success, String feedback) {
        this.success = success;
        this.feedback = feedback;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
