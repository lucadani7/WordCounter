package com.lucadani;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {
    public static boolean isTextNullOrEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    public static int countWords(String text) {
        return isTextNullOrEmpty(text) ? 0 : text.trim().split("\\s+").length;
    }

    public static int countParagraphs(String text) {
        return isTextNullOrEmpty(text) ? 0 : text.trim().split("\n+").length;
    }

    public static String mostFrequentWord(String text) {
        if (isTextNullOrEmpty(text)) {
            return "None";
        }
        text = text.toLowerCase().replaceAll("[^\\p{L}\\p{Nd}\\s]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        if (freqMap.isEmpty()) {
            return "None";
        }
        int maxFreq = freqMap.values().stream().max(Integer::compare).orElse(0);
        List<String> mostFrequent = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == maxFreq)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();
        return String.join(", ", mostFrequent) + " (" + maxFreq + (maxFreq == 1 ? " time" : " times") + ")";
    }
}
