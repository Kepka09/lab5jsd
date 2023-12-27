package org.example;

public class TextAnalyzer {
    public static void main(String[] args) {
        String text = "Сонце світить яскраво, а небо чисте. Ліс сповнений таємниць, а вітер шепоче серед дерев. " +
                "Кожен день надійний, кожен день новий. " +
                "Ліс мовчить вночі, а вітер легко віє. " +
                "Кожен день приносить щось нове, але кожен день також несе в собі спокій." +
                " Вода у річці прохолодна, а ліс повний життя. " +
                "Люди часто шукають відповіді серед зірок, але іноді вони є прямо перед ними.";

        try {
            TextProcessor processor = new TextProcessor(text);
            int maxSameWordCount = processor.findMaxSentenceWithSameWords();
            System.out.println("Максимальна кількість речень з однаковими словами: " + maxSameWordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}