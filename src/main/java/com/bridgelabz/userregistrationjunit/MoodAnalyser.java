package com.bridgelabz.userregistrationjunit;

public class MoodAnalyser {
    public static String analyserMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successfully";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else return null;
    }
}
