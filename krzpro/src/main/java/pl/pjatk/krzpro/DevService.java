package pl.pjatk.krzpro;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from Dev";
    }
}
