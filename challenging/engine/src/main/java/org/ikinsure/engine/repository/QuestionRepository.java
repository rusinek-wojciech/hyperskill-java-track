package org.ikinsure.engine.repository;

import org.ikinsure.engine.model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class QuestionRepository {

    private static final Integer FIRST_ID = 1;
    private final List<Question> questions;

    public QuestionRepository() {
        this.questions = new ArrayList<>();
    }

    public Optional<Question> findFirstById(Integer id) {
        return this.questions.stream()
                .filter(q -> q.getId() == id)
                .findFirst();
    }

    public void save(Question question) {
        this.questions.add(question);
    }

    public List<Question> getAll() {
        return this.questions;
    }

    public int searchMissingId() {
        List<Integer> ids = this.questions.stream()
                .map(Question::getId)
                .sorted()
                .collect(Collectors.toList());
        int counter = FIRST_ID;
        for (Integer id : ids) {
            if (id != counter) {
                return counter;
            }
            counter++;
        }
        return ids.size() + FIRST_ID;
    }
}
