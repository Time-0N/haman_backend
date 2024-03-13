package com.example.haman_backend;

public class HamanService {

    private final HamanRepository hangmanRepository = new HamanRepository();

    public HamanGameState getGameState() {
        return hangmanRepository.getGameState();
    }

    public HamanGameState postWord(String input) {
        hangmanRepository.resetGame();
        hangmanRepository.setWord(input);
        hangmanRepository.setGameStateIsRunningTrue();
        return hangmanRepository.getGameState();
    }

    public HamanGameState postGuess(char input) {
        return hangmanRepository.guessWord(input);
    }
}
