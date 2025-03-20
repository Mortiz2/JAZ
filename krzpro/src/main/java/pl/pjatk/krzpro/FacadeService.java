package pl.pjatk.krzpro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FacadeService {

    private final List<HandlerServiceInterface> services;
    private final String environment;

    public FacadeService(List<HandlerServiceInterface> services, @Value("${app.environment:dev}") String environment) {
        this.services = services;
        this.environment = environment;
    }

    public String execute() {
        return switch (environment.toLowerCase()) {
            case "dev" -> services.stream()
                    .filter(s -> s instanceof DevService)
                    .findFirst()
                    .map(HandlerServiceInterface::getMessage)
                    .orElse("No service found");

            case "qa" -> services.stream()
                    .filter(s -> s instanceof QaService)
                    .findFirst()
                    .map(HandlerServiceInterface::getMessage)
                    .orElse("No service found");

            case "staging" -> services.stream()
                    .filter(s -> s instanceof StagingService)
                    .findFirst()
                    .map(HandlerServiceInterface::getMessage)
                    .orElse("No service found");

            case "prod" -> services.stream()
                    .filter(s -> s instanceof ProdService)
                    .findFirst()
                    .map(HandlerServiceInterface::getMessage)
                    .orElse("No service found");

            default -> "Unknown environment";
        };
    }
}
