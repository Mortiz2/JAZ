package pl.pjatk.krzpro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RequestExecutor implements CommandLineRunner {

    private final FacadeService facadeService;

    public RequestExecutor(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @Override
    public void run(String... args) {
        System.out.println(facadeService.getMessage());
    }
}
