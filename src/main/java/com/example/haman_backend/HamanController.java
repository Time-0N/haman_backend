package com.example.haman_backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/haman")
public class HamanController {

    private final HamanService hangmanService = new HamanService();

    @GetMapping("/getHaman")
    public HamanGameState getGameState() {
        return hangmanService.getGameState();
    }


    @PostMapping("/enterWord")
    public HamanGameState postWord(@RequestBody String input) {
        return hangmanService.postWord(input);
    }

    @PostMapping("/guessWord")
    public HamanGameState postGuess(@RequestBody Guess input) {
        return hangmanService.postGuess(input.getGuess());
    }
}