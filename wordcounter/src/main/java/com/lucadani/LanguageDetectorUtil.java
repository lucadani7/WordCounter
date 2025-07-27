package com.lucadani;

import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;
import com.neovisionaries.i18n.LanguageAlpha3Code;

public class LanguageDetectorUtil {
    private static final LanguageDetector detector = LanguageDetectorBuilder.fromAllLanguages().build();

    public static String detectLanguage(String text) {
        if (TextAnalyzer.isTextNullOrEmpty(text)) {
            return "Unknown";
        }
        var code = LanguageAlpha3Code.getByCode(detector.detectLanguageOf(text).getIsoCode639_3().toString());
        return code == null ? "Unknown" : code.getName();
    }
}
