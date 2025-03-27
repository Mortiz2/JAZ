package pl.pjatk.krzpro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    private final FacadeService facadeService;

    public MessageController(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return facadeService.execute();
    }
}
