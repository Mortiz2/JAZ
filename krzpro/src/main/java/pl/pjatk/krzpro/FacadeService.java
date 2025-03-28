package pl.pjatk.krzpro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class FacadeService {

    private final Map<String, HandlerServiceInterface> serviceMap;
    private final String environment;

    public FacadeService(List<HandlerServiceInterface> services,
                         @Value("${app.environment:dev}") String environment) {
        this.serviceMap = services.stream()
                .collect(Collectors.toMap(service -> service.getClass().getSimpleName()
                        .toLowerCase()
                        .replace("service", ""), Function.identity()));
        this.environment = environment.toLowerCase();
    }

    public String getMessage() {
        return serviceMap.getOrDefault(environment, serviceMap.get("dev")).getMessage();
    }
}
