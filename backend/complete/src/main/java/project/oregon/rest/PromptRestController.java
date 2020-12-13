package project.oregon.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.oregon.businesslogic.PromptController;
import project.oregon.models.Prompt;

@RestController
public class PromptRestController {
    private final PromptController promptController;

    public PromptRestController(PromptController promptController) {
        this.promptController = promptController;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/prompt")
    public Prompt getPrompt() {
        return promptController.getPrompt();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/choose")
    public void choose(@RequestParam("id") String id) {
        promptController.choose(id);
    }
}
