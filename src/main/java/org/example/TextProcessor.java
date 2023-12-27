package org.example;
import java.util.*;

class TextProcessor {
    private Text text;

    public TextProcessor(String text) {
        this.text = new Text(text);
    }

    public int findMaxSentenceWithSameWords() {
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (Sentence sentence : text.getSentences()) {
            Set<String> wordsInSentence = new HashSet<>();
            for (Word word : sentence.getWords()) {
                wordsInSentence.add(word.getWord().toLowerCase());
            }

            for (String word : wordsInSentence) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(wordFrequency.values());
    }
}