package org.ikinsure.engine.model;

import java.util.List;

public class Question {

    private Integer id;
    private String title;
    private String text;
    private List<String> options;
    private List<Integer> answers;

    public Question() {

    }

    public Question(Integer id,
                    String title,
                    String text,
                    List<String> options,
                    List<Integer> answers) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.options = options;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Integer> answers) {
        this.answers = answers;
    }
}
