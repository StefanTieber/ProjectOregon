package project.oregon.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.oregon.businesslogic.PromptController;
import project.oregon.businesslogic.ScoreController;
import project.oregon.dtos.IntWrapper;
import project.oregon.models.Prompt;

@RestController
public class ScoreRestController {

    @CrossOrigin(origins = "*")
    @GetMapping("/getScore")
    public IntWrapper getScore() {
        return new IntWrapper(ScoreController.getScore());
    }
}
