package org.example;
import java.util.*;

class Sentence {
    private List<Word> words;

    public Sentence(String sentence) {
        words = new ArrayList<>();
        for (String word : sentence.split("\\s+")) {
            words.add(new Word(word));
        }
    }

    public List<Word> getWords() {
        return words;
    }
}