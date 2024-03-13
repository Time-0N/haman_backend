package com.example.haman_backend;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class HamanGameState {
    boolean gameIsRunning;
    GameResult gameResult;
    char[] correctLetters;
    String[] guessedLetters;
    int errors;

    public HamanGameState(boolean gameIsRunning, GameResult gameResult, char[] correctLetters, String[] guessedLetters, int errors) {
        this.gameIsRunning = gameIsRunning;
        this.gameResult = gameResult;
        this.correctLetters = correctLetters;
        this.guessedLetters = guessedLetters;
        this.errors = errors;
    }

    public void setCorrectLetters(char[] newCorrectLetters) {
        correctLetters = newCorrectLetters;
        for (int i = 0; i < correctLetters.length; i++) {
            correctLetters[i] = '_';
        }
    }

    public void setCorrectLetters(char input, int index) {
        this.correctLetters[index] = input;
    }

    public void setGameIsRunning(boolean gameIsRunning) {
        this.gameIsRunning = gameIsRunning;
    }
}

