package org.ikinsure.engine.dto;

import java.util.List;

public class QuestionGetDto {

    private Integer id;
    private String title;
    private String text;
    private List<String> options;

    public QuestionGetDto() {

    }

    public QuestionGetDto(Integer id,
                          String title,
                          String text,
                          List<String> options) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}

