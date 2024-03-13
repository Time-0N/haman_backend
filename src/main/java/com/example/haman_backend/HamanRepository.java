package com.example.haman_backend;

public class HamanRepository {

    String[] guessedLetters = {};
    char[] correctLetters = {};
    private HamanGameState hangmanGameState = new HamanGameState(false, GameResult.RUNNING, correctLetters, guessedLetters,0);

    Word wordSolution = new Word("");

    public void setGameStateIsRunningTrue() {
        hangmanGameState.setGameIsRunning(true);
    }

    public HamanGameState getGameState() {
        return hangmanGameState;
    }

    public void resetGame() {
        hangmanGameState = new HamanGameState(false, GameResult.RUNNING, correctLetters,  guessedLetters,0);
    }

    public void setWord(String input) {
        wordSolution.setWord(input);
        System.out.println(input);
        hangmanGameState.setCorrectLetters(new char[input.length()]);
        System.out.println(hangmanGameState.getCorrectLetters());
    }

    public HamanGameState guessWord(char input) {

        boolean matchDetected = false;

        for (String str : hangmanGameState.guessedLetters) {
            if (str.contains(String.valueOf(input))) {
                return hangmanGameState;
            }
        }

        for (int i = 0; i < wordSolution.getWord().length(); i++) {
            char currentChar = wordSolution.getWord().charAt(i);

            if (currentChar == input) {
                hangmanGameState.setCorrectLetters(input, i);
                matchDetected = true;
            }
        }

        if (!matchDetected) {
            hangmanGameState.errors++;
        }

        return hangmanGameState;

    }

}

