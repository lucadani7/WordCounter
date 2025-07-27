package com.lucadani;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter text to analyze (type 'END' on a new line to finish):");
            StringBuilder inputBuilder;
            for (inputBuilder = new StringBuilder(); scanner.hasNext();) {
                String line = scanner.nextLine();
                if ("END".equalsIgnoreCase(line.trim())) {
                    break;
                }
                inputBuilder.append(line).append("\n");
            }
            String input = inputBuilder.toString();

            // Language detection
            String language = LanguageDetectorUtil.detectLanguage(input);
            System.out.println("Detected Language: " + language);

            // Word count
            int wordCount = TextAnalyzer.countWords(input);
            System.out.println("Word Count: " + wordCount);

            // Paragraph count
            int paragraphCount = TextAnalyzer.countParagraphs(input);
            System.out.println("Paragraph Count: " + paragraphCount);

            // Most frequent word
            String frequentWord = TextAnalyzer.mostFrequentWord(input);
            System.out.println("Most Frequent Word: " + frequentWord);

            boolean userWannaQuit;
            String answer;
            do {
                System.out.print("Do you want to continue? [yes / no]: ");
                answer = scanner.nextLine();
                if ("yes".equalsIgnoreCase(answer)) {
                    userWannaQuit = false;
                    break;
                }
                if ("no".equalsIgnoreCase(answer)) {
                    userWannaQuit = true;
                    break;
                }
                System.out.println("Please enter 'yes' or 'no'!");
            } while (true);

            if (userWannaQuit) {
                break;
            }
        } while (true);
    }
}