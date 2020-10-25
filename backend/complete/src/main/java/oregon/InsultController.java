package oregon;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class InsultController {
    private static final String INSULT = "erster Sieg der Menschheit";

    @CrossOrigin(origins = "*")
    @GetMapping("/insult")
    public Insult getInsult(){
        return new Insult(INSULT);
    }
}
