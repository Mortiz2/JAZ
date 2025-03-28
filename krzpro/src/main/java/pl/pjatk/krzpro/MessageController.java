package pl.pjatk.krzpro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    private final FacadeService facadeService;

    @Autowired
    public MessageController(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        String message = facadeService.getMessage();
        return ResponseEntity.ok(message);
    }
}

