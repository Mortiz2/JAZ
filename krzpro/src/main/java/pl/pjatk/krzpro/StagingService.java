package pl.pjatk.krzpro;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("staging")
public class StagingService implements HandlerServiceInterface {

    @Override
    public String getMessage() {
        return "Hello from Staging";
    }
}
