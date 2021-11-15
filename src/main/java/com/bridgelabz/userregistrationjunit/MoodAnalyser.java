package com.bridgelabz.userregistrationjunit;

public class MoodAnalyser {
    public static String analyserMood(String mood) throws MoodAnalyzerException {
        try {
            if (mood.length() == 0) {
                throw new MoodAnalyzerException(MoodAnalyzerException.type.EMPTY, "Invalid Input");
            } else if (mood.toLowerCase().contains("happy")) {
                return "Entry Successfully";
            } else if (mood.toLowerCase().contains("sad")) {
                return "Entry Failed";
            } else {
                return "Invalid Input";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.type.NULL, "Invalid mood");
        }
    }
}
